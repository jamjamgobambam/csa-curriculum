import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Project.java Test")
public class ProjectTest {

  String message;
  String messageGap = "\n       ";
  static Project testObject;
  static Class objectClass;
  Field staticField;
  Method staticMethod;
   
  @BeforeAll
  public static void setup() {   
    testObject = new Project("some project", 1000, "some category");
    objectClass = testObject.getClass();
  }

  @Test
  @Order(1)
  @DisplayName("The Project class has a static variable called numProjects => ")
  public void testObjectNumProjectsExists() {
    String variableNotExists = "The Project class does not have a variable called numProjects." + messageGap;
    String variableNotStatic = "The numProjects variable is not static." + messageGap;

    String expected = "numProjects";
    String actual = "MISSING";

    setStaticField(expected);
    int modifierValue = 0;
    
    try {
      actual = staticField.getName();
      modifierValue = staticField.getModifiers();
    } catch (Exception e) { }

    assertEquals(expected, actual, variableNotExists);
    assertTrue(Modifier.isStatic(modifierValue), variableNotStatic);
  }
   
  @Test
  @Order(2)
  @DisplayName("The static variable numProjects is initialized to 0 => ")
  public void testObjectNumProjectIsZero() {
    message = "The static variable numProjects is initialized to a different value than 0." + messageGap;

    setStaticField("numProjects");
    int actual = -1;
    
    try {
      actual = (int) staticField.get(testObject);
    } catch (Exception e) { }
    
    assertEquals(0, actual, message);
  }
   
  @Test
  @Order(3)
  @DisplayName("The Project class has a getNumProjects method => ")
  public void testObjectGetNumProjectsExists() {
    message = "The method getNumProjects() is missing." + messageGap;

    String expectedMethodName = "getNumProjects";
    setStaticMethod(expectedMethodName);
    String staticMethodName = "";

    try {
      staticMethodName = staticMethod.getName();
      assertEquals(expectedMethodName, staticMethodName, message);
    } catch (Exception e) {
      fail("The method getNumProjects() is missing from the Project class." + messageGap);
    }
  }
   
  @Test
  @Order(4)
  @DisplayName("getNumProjects is a static method => ")
  public void testGetNumProjectsIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;

    setStaticMethod("getNumProjects");
    int methodModifiers = -1;

    try {
      methodModifiers = staticMethod.getModifiers();
      assertTrue(Modifier.isStatic(methodModifiers), message);
    } catch(Exception e) {
      fail("The getNumProjects() method is missing from the Project class or is not a static method." + messageGap);
    }
  }
  
  @Test
  @Order(5)
  @DisplayName("getNumProjects returns a String containing the text \"There are {numProjects} projects on Kickstarter!\" => ")
  public void testGetNumProjectsResult() {
    message = "Return a String containing the text \"There are {numProjects} projects on Kickstarter!\", where";
    message += "\n        numProjects is the number of Project objects that have been instantiated." + messageGap;

    setStaticMethod("getNumProjects");
    int numObjectsCreated = setRandomObjects();

    String expected = "There are " + numObjectsCreated + " projects on Kickstarter!";
    String actual = "MISSING";

    try {
      actual = (String) staticMethod.invoke(testObject);
    } catch (Exception e) { }

    assertEquals(expected, actual, message);
  }

  private void setStaticField(String fieldName) {
    try {
      staticField = objectClass.getDeclaredField(fieldName);
      staticField.setAccessible(true);
      staticField.setInt(testObject, 0);
    } catch (Exception e) { }
  }

  @SuppressWarnings("unchecked")
  private void setStaticMethod(String methodName) {
    try {
     staticMethod = objectClass.getMethod(methodName);
    } catch (Exception e) { }
  }

  private int setRandomObjects() {
    int randomObjects = (int)(Math.random() * 10) + 2;
    
    String testName = "some project";
    int testBackers = 1000;
    String testCategory = "some category";

    for (int count = 0; count < randomObjects; count++) {
      Project aProject = new Project(testName, testBackers, testCategory);
    }

    return randomObjects;
  }

}