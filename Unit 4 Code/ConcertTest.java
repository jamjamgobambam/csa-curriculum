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
@DisplayName("Concert.java Test")
public class ConcertTest {

  String message;
  String messageGap = "\n       ";
  static Concert testObject;
  static Class objectClass;
  Field staticField;
  Method staticMethod;
   
  @BeforeAll
  public static void setup() {
    testObject = new Concert("some location", 2000);
    objectClass = testObject.getClass();
  }

  @Test
  @Order(1)
  @DisplayName("The Concert class has a static variable called maxAttendance => ")
  public void testObjectMaxAttendanceExists() {
    String variableNotExists = "The Concert class does not have a variable called maxAttendance." + messageGap;
    String variableNotStatic = "The maxAttendance variable is not static." + messageGap;

    String expected = "maxAttendance";
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
  @DisplayName("The static variable maxAttendance is initialized to 0 => ")
  public void testObjectsMaxAttendanceIsZero() {
    message = "The static variable maxAttendance is initialized to a different value than 0." + messageGap;

    setStaticField("maxAttendance");
    int actual = -1;
    
    try {
      actual = (int) staticField.get(testObject);
    } catch (Exception e) { }

    assertEquals(0, actual, message);
  }
   
  @Test
  @Order(3)
  @DisplayName("The Concert class has a getMaxAttendance method => ")
  public void testObjectGetMaxAttendanceExists() {
    message = "The method getMaxAttendance() is missing." + messageGap;

    String expectedMethodName = "getMaxAttendance";
    setStaticMethod(expectedMethodName);
    String staticMethodName = "";

    try {
      staticMethodName = staticMethod.getName();
      assertEquals(expectedMethodName, staticMethodName, message);
    } catch (Exception e) {
      fail("The method getMaxAttendance() is missing from the Concert class." + messageGap);
    }
  }
   
  @Test
  @Order(4)
  @DisplayName("getMaxAttendance is a static method => ")
  public void testGetMaxAttendanceIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;

    setStaticMethod("getMaxAttendance");
    int methodModifiers = -1;
    
    try {
      methodModifiers = staticMethod.getModifiers();
      assertTrue(Modifier.isStatic(methodModifiers), message);
    } catch(Exception e) {
      fail("The getMaxAttendance() method is missing from the Concert class or is not a static method." + messageGap);
    }
  }
  
  @Test
  @Order(5)
  @DisplayName("getMaxAttendance returns a String containing the text \"The max attendance at an event is {maxAttendance}!\" => ")
  public void testGetMaxAttendanceResult() {
    message = "Return a String containing the text \"The max attendance at an event is {maxAttendance}!\", where";
    message += "\n        maxAttendance is the largest attendance at an event." + messageGap;

    setStaticMethod("getMaxAttendance");
    int[] randomAttendance = getAttendance();
    setRandomObjects(randomAttendance);
    int testMax = getTestMaxAttendance(randomAttendance);
    
    String expected = "The max attendance at an event is " + testMax + "!";
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

  private int getRandomNumObjects() {
    int randomObjects = (int)(Math.random() * 10) + 1;
    return randomObjects;
  }

  private int[] getAttendance() {
    int numObjects = getRandomNumObjects();
    int[] randomAttendance = new int[numObjects];

    for (int index = 0; index < randomAttendance.length; index++) {
      randomAttendance[index] = (int)(Math.random() * 50000) + 20000;
    }

    return randomAttendance;    
  }

  private int getTestMaxAttendance(int[] randomAttendance) {
    int max = randomAttendance[0];

    for (int value : randomAttendance) {
      if (value > max) {
        max = value;
      }
    }

    return max;
  }

  private void setRandomObjects(int[] randomAttendance) {
    String testLocation = "some location";
    Concert[] testConcerts = new Concert[randomAttendance.length];

    for (int index = 0; index < testConcerts.length; index++) {
      testConcerts[index] = new Concert(testLocation, randomAttendance[index]);
    }
  }

}