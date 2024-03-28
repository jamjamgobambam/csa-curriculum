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
@DisplayName("Startup.java Test")
public class StartupTest {

  String message;
  String messageGap = "\n       ";
  static Startup testObject;
  static Class objectClass;
  Field staticField;
  Method staticMethod;
   
  @BeforeAll
  public static void setup() {
    testObject = new Startup("some company", "some description", true);
    objectClass = testObject.getClass();
  }

  @Test
  @Order(1)
  @DisplayName("The Startup class has a static variable called numStartups => ")
  public void testObjectNumStartupsExists() {
    String variableNotExists = "The Startup class does not have a variable called numStartups." + messageGap;
    String variableNotStatic = "The numStartups variable is not static." + messageGap;

    String expected = "numStartups";
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
  @DisplayName("The static variable numStartups is initialized to 0 => ")
  public void testObjectsNumStartupsIsZero() {
    message = "The static variable numStartups is initialized to a different value than 0." + messageGap;

    setStaticField("numStartups");
    int actual = -1;
    
    try {
      actual = (int) staticField.get(testObject);
    } catch (Exception e) { }

    assertEquals(0, actual, message);
  }
   
  @Test
  @Order(3)
  @DisplayName("The Startup class has a getNumStartups method => ")
  public void testObjectGetNumStartupsExists() {
    message = "The method getNumStartups() is missing." + messageGap;

    String expectedMethodName = "getNumStartups";
    setStaticMethod(expectedMethodName);
    String staticMethodName = "";

    try {
      staticMethodName = staticMethod.getName();
      assertEquals(expectedMethodName, staticMethodName, message);
    } catch (Exception e) {
      fail("The method getNumStartups() is missing from the Startup class." + messageGap);
    }
  }
   
  @Test
  @Order(4)
  @DisplayName("getNumStartups is a static method => ")
  public void testGetNumStartupsIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;

    setStaticMethod("getNumStartups");
    int methodModifiers = -1;
    
    try {
      methodModifiers = staticMethod.getModifiers();
      assertTrue(Modifier.isStatic(methodModifiers), message);
    } catch(Exception e) {
      fail("The getNumStartups() method is missing from the Startup class or is not a static method." + messageGap);
    }
  }
  
  @Test
  @Order(5)
  @DisplayName("getNumStartups returns a String containing the text \"There have been {numStartups} startup pitches on Shark Tank!\" => ")
  public void testGetNumStartupsResult() {
    message = "Return a String containing the text \"There have been {numStartups} startup pitches on Shark Tank!\", where";
    message += "\n        numStartups is the number of Startup objects that have been instantiated." + messageGap;

    setStaticMethod("getNumStartups");
    int numObjectsCreated = setRandomObjects();
    
    String expected = "There have been " + numObjectsCreated + " startup pitches on Shark Tank!";
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
    int randomObjects = (int)(Math.random() * 10) + 1;
    
    String testName = "some company";
    String testDescription = "some description";
    boolean testDeal = true;

    for (int count = 0; count < randomObjects; count++) {
      Startup aStartup = new Startup(testName, testDescription, testDeal);
    }

    return randomObjects;
  }

}