import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("TravelAgency.java Test")
public class TravelAgencyTest {

  String message;
  String messageGap = "\n       ";
  TravelAgency testObject;
  Class testClass;
  Field constantField;
   
  @BeforeEach
  public void setup() {
    Rollercoaster[] testCoasters = getRandomCoasters();
    testObject = new TravelAgency(testCoasters);
    testClass = testObject.getClass();
  }
   
  @Test
  @Order(1)
  @DisplayName("The TravelAgency class has a constant called CHILD_MAX_SPEED => ")
  public void testConstantExists() {
    String constantNotExists = "The TravelAgency class does not have a variable called CHILD_MAX_SPEED." + messageGap;
    String constantNotStatic = "The CHILD_MAX_SPEED variable is not static." + messageGap;
    String constantNotFinal = "The CHILD_MAX_SPEED variable is not final." + messageGap;

    String expected = "CHILD_MAX_SPEED";
    String actual = "MISSING";

    setConstantField(expected);
    int modifierValue = 0;

    try {
      actual = constantField.getName();
      modifierValue = constantField.getModifiers();
    } catch (Exception e) { }

    assertEquals(expected, actual, constantNotExists);
    assertTrue(Modifier.isStatic(modifierValue), constantNotStatic);
    assertTrue(Modifier.isFinal(modifierValue), constantNotFinal);
  }
   
  @Test
  @Order(2)
  @DisplayName("The constant CHILD_MAX_SPEED is initialized to 35 => ")
  public void testConstantInitialValueIsZero() {
    message = "The constant CHILD_MAX_SPEED is initialized to a different value than 35." + messageGap;

    int expected = 35;
    setConstantField("CHILD_MAX_SPEED");
    int actual = -1;
    
    try {
      actual = (int) constantField.get(testObject);
    } catch (Exception e) { }
    
    assertEquals(expected, actual, message);
  }

  private Rollercoaster[] getRandomCoasters() {
    int numObjects = (int)(Math.random() * 10) + 1;
    Rollercoaster[] temp = new Rollercoaster[numObjects];

    for (int index = 0; index < temp.length; index++) {
      int randomSpeed = (int)(Math.random() * 50) + 10;
      temp[index] = new Rollercoaster("some coaster", randomSpeed);
    }

    return temp;
  }

  private void setConstantField(String fieldName) {
    try {
      constantField = testClass.getDeclaredField(fieldName);
      constantField.setAccessible(true);
    } catch (Exception e) { }
  }

}