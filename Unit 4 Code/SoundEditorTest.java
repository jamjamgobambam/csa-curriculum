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
@DisplayName("SoundEditor.java Test")
public class SoundEditorTest {

  String message;
  String failMessage;
  String messageGap = "\n       ";
  SoundEditor testSoundEditor;
  Class soundEditorClass;
  Method staticMethod;
  Class[] methodFields;
   
  @BeforeEach
  @SuppressWarnings("unchecked")
  public void setup() {
    failMessage = "The SoundEditor class does not have a method called combineSounds or the parameters are missing." + messageGap;
      
    testSoundEditor = new SoundEditor();
    soundEditorClass = testSoundEditor.getClass();

    methodFields = new Class[]{double[].class, double[].class};

    try {
      staticMethod = soundEditorClass.getMethod("combineSounds", methodFields);
    } catch (Exception e) {
      fail(failMessage);
    }
  }
   
  @Test
  @Order(1)
  @DisplayName("The SoundEditor class has a combineSounds method with parameters double[] firstSound and double[] secondSound => ")
  public void testSoundEditorCombineSounds() {
    message = "combineSounds is missing or does not have the expected parameters (double[] firstSound, double[] secondSecond)." + messageGap;

    String staticMethodName = staticMethod.getName();
    String expectedMethodName = "combineSounds";
    
    assertEquals(expectedMethodName, staticMethodName, message);
  }
   
  @Test
  @Order(2)
  @DisplayName("combineSounds is a static method => ")
  public void testCombineSoundsIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;
    int methodModifiers = staticMethod.getModifiers();
    assertTrue(Modifier.isStatic(methodModifiers), message);
  }
  
  @Test
  @Order(3)
  @DisplayName("combineSounds returns a new sound with firstSound followed by secondSound => ")
  public void testCombineSoundsResult() {
    message = "Return a new double array that contains the values in firstSound followed by secondSound." + messageGap;

    double[] testFirst = new double[10];
    double[] testSecond = new double[10];
    double[] testCombined = new double[20];

    int combinedIndex = 0;

    for (int index = 0; index < testFirst.length; index++) {
      testCombined[combinedIndex] = testFirst[index];
      combinedIndex++;
    }

    for (int index = 0; index < testSecond.length; index++) {
      testCombined[combinedIndex] = testSecond[index];
      combinedIndex++;
    }

    double[] actual = null;

    try {
      actual = (double[]) staticMethod.invoke(staticMethod, testFirst, testSecond);
    } catch (Exception e) {
      fail(failMessage);
    }

    assertArrayEquals(testCombined, actual, message);
  }

}