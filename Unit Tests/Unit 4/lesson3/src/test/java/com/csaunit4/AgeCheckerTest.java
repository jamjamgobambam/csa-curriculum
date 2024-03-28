package com.csaunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("AgeChecker.java Test")
public class AgeCheckerTest {

    AgeChecker myAge;
    String message;

    @BeforeEach
    public void setup() {
        myAge = new AgeChecker();
    }
    
    @Test
    @Order(1)
    @DisplayName("Return \"Child\" if \"age\" is less than or equal to 18 and less than or equal to 13 => ")
    public void testCheckAgeReturnsChild() {
        message = "AgeChecker checkAge() does not return \"Child\" as expected. Make sure the conditional statements ";
        message += "\n        checks if \"age\" is less than or equal to 18 and less than or equal to 13.";
        message += "\n       ";

        String result = myAge.checkAge(10);

        assertEquals("Child", result, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return \"Teenager\" if \"age\" is less than or equal to 18 and greater than 13 => ")
    public void testCheckAgeReturnsTeenager() {
        message = "AgeChecker checkAge() does not return \"Teenager\" as expected. Make sure the conditional statements ";
        message += "\n        checks if \"age\" is less than or equal to 18 and greater than 13.";
        message += "\n       ";

        String result = myAge.checkAge(16);

        assertEquals("Teenager", result, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return \"Adult\" if \"age\" is greater than 18 => ")
    public void testCheckAgeReturnsAdult() {
        message = "AgeChecker checkAge() does not return \"Adult\" as expected. ";
        message += "\n        Make sure the conditional statement checks if \"age\" is greater than 18.";
        message += "\n       ";

        String result = myAge.checkAge(20);

        assertEquals("Adult", result, message);
    }

}