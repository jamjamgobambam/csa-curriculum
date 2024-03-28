import static org.junit.jupiter.api.Assertions.*;

import org.code.theater.*;
import org.code.media.*;

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
    failMessage = "The SoundEditor class does not have a method called createClip or the parameters are missing." + messageGap;
      
    testSoundEditor = new SoundEditor();
    soundEditorClass = testSoundEditor.getClass();

    methodFields = new Class[]{double[].class, int.class, int.class};

    try {
      staticMethod = soundEditorClass.getMethod("createClip", methodFields);
    } catch (Exception e) {
      fail(failMessage);
    }
  }
   
  @Test
  @Order(1)
  @DisplayName("The SoundEditor class has a createClip method with parameters double[] sound, int start, and int end => ")
  public void testSoundEditorCreateClip() {
    message = "createClip is missing or does not have the expected parameters (double[] sound, int start, int end)." + messageGap;

    String staticMethodName = staticMethod.getName();
    String expectedMethodName = "createClip";
    
    assertEquals(expectedMethodName, staticMethodName, message);
  }
   
  @Test
  @Order(2)
  @DisplayName("createClip is a static method => ")
  public void testCreateClipIsStatic() {
    message = "Make sure to include the keyword static in the method signature." + messageGap;
    int methodModifiers = staticMethod.getModifiers();
    assertTrue(Modifier.isStatic(methodModifiers), message);
  }
  
  @Test
  @Order(3)
  @DisplayName("createClip returns a new sound that contains the samples in sound from start to end => ")
  public void testCreateClipResult() {
    message = "Return a new double array that contains the samples in sound from start to end." + messageGap;

    double[] testSound = SoundLoader.read("retrobeat.wav");
    int randomStart = (int)(Math.random() * (testSound.length / 2));
    int randomEnd = (int)(Math.random() * (testSound.length / 2)) + (testSound.length / 2);

    double[] expected = clipSound(testSound, randomStart, randomEnd);
    double[] actual = null;

    try {
      actual = (double[]) staticMethod.invoke(staticMethod, randomStart, randomEnd);
    } catch (Exception e) {
      fail(failMessage);
    }

    assertArrayEquals(expected, actual, message);
  }

  private double[] clipSound(double[] sound, int start, int end) {
    int startIndex = start * 44100;
    int endIndex = end * 44100;
    
    double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }

}