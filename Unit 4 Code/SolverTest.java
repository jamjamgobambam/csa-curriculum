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
@DisplayName("Solver.java Test")
public class SolverTest {

  String message;
  String messageGap = "\n       ";
  static Solver testObject;
  static Class objectClass;
  Field staticField;
  Method staticMethod;
   
  @BeforeAll
  public static void setup() {
    testObject = new Solver("some person", 200);
    objectClass = testObject.getClass();
  }

  @Test
  @Order(1)
  @DisplayName("The Solver class has a static variable called fastestTime => ")
  public void testObjectFastestTimeExists() {
    String variableNotExists = "The Solver class does not have a variable called fastestTime." + messageGap;
    String variableNotStatic = "The fastestTime variable is not static." + messageGap;

    String expected = "fastestTime";
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
  @DisplayName("The static variable fastestTime is initialized to 0 => ")
  public void testObjectsFastestTimeIsZero() {
    message = "The static variable fastestTime is initialized to a different value than 0." + messageGap;

    setStaticField("fastestTime");
    int actual = -1;
    
    try {
      actual = (int) staticField.get(testObject);
    } catch (Exception e) { }

    assertEquals(0, actual, message);
  }
   
  @Test
  @Order(3)
  @DisplayName("The Solver class has a getFastestTime method => ")
  public void testObjectGetFastestTimeExists() {
    message = "The method getFastestTime() is missing." + messageGap;

    String expectedMethodName = "getFastestTime";
    setStaticMethod(expectedMethodName);
    String staticMethodName = "";

    try {
      staticMethodName = staticMethod.getName();
      assertEquals(expectedMethodName, staticMethodName, message);
    } catch (Exception e) {
      fail("The method getFastestTime() is missing from the Solver class." + messageGap);
    }
  }
   
  @Test
  @Order(4)
  @DisplayName("getFastestTime is a static method => ")
  public void testGetFastestTimeIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;

    setStaticMethod("getFastestTime");
    int methodModifiers = -1;
    
    try {
      methodModifiers = staticMethod.getModifiers();
      assertTrue(Modifier.isStatic(methodModifiers), message);
    } catch(Exception e) {
      fail("The getFastestTime() method is missing from the Solver class or is not a static method." + messageGap);
    }
  }
  
  @Test
  @Order(5)
  @DisplayName("getFastestTime returns a String containing the text \"The fastest time so far is {fastestTime}\" => ")
  public void testGetFastestTimeResult() {
    message = "Return a String containing the text \"The fastest time so far is {fastestTime}\", where";
    message += "\n        fastestTime is the fastest time of all Solver objects." + messageGap;

    setStaticMethod("getFastestTime");
    int[] times = getTimes();
    setRandomObjects(times);
    int fastestTime = getFastestTime(times);
    
    String expected = "The fastest time so far is " + fastestTime;
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

  private int[] getTimes() {
    int numObjects = getRandomNumObjects();
    int[] times = new int[numObjects];

    for (int index = 0; index < times.length; index++) {
      times[index] = (int)(Math.random() * 500) + 100;
    }

    return times;    
  }

  private int getFastestTime(int[] times) {
    int max = times[0];

    for (int value : times) {
      if (value > max) {
        max = value;
      }
    }

    return max;
  }

  private void setRandomObjects(int[] times) {
    String testName = "some name";
    Solver[] testSolvers = new Solver[times.length];

    for (int index = 0; index < testSolvers.length; index++) {
      testSolvers[index] = new Solver(testName, times[index]);
    }
  }

}