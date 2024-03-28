import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("GradeCalculator.java Test")
public class GradeCalculatorTest {

  String message;
  String failMessage;
  String messageGap = "\n       ";
  GradeCalculator testGradeCalculator;
  Class gradeCalculatorClass;
  Method staticMethod;
  Class[] methodFields;
   
  @BeforeEach
  @SuppressWarnings("unchecked")
  public void setup() {
    failMessage = "The GradeCalculator class does not have a method called calcAverageGrade or the parameter is missing." + messageGap;
      
    testGradeCalculator = new GradeCalculator();
    gradeCalculatorClass = testGradeCalculator.getClass();

    methodFields = new Class[]{int[].class};

    try {
      staticMethod = gradeCalculatorClass.getMethod("calcAverageGrade", methodFields);
    } catch (Exception e) {
      fail(failMessage);
    }
  }
   
  @Test
  @Order(1)
  @DisplayName("The GradeCalculator class has a calcAverageGrade method with a parameter int[] grades => ")
  public void testGradeCalculatorCalcAverageGrade() {
    message = "calcAverageGrade is missing or does not have the expected parameter (int[] grades)." + messageGap;

    String staticMethodName = staticMethod.getName();
    String expectedMethodName = "calcAverageGrade";
    
    assertEquals(expectedMethodName, staticMethodName, message);
  }
   
  @Test
  @Order(2)
  @DisplayName("calcAverageGrade is a static method => ")
  public void testCalcAverageGradeIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;
    int methodModifiers = staticMethod.getModifiers();
    assertTrue(Modifier.isStatic(methodModifiers), message);
  }
  
  @Test
  @Order(3)
  @DisplayName("calcAverageGrade returns the average of the values in the parameter grades => ")
  public void testCalcAverageGradeResult() {
    message = "Return the average of the values in the parameter grades." + messageGap;

    int randomNumGrades = (int)(Math.random() * 10) + 2;
    int[] testGrades = new int[randomNumGrades];
    int total = 0;

    for (int index = 0; index < testGrades.length; index++) {
      int randomNum = (int)(Math.random() * 100) + 20;
      testGrades[index] = randomNum;
      total += randomNum;
    }

    int expected = total / randomNumGrades;
    int actual = -1;

    try {
      actual = (Integer) staticMethod.invoke(testGradeCalculator, testGrades);
    } catch (Exception e) {
      fail(failMessage);
    }

    assertEquals(expected, actual, message);
  }

}