package com.csaunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Course.java Test")
public class CourseTest {
    
    Course csCourse = new Course("Ms. Lovelace");
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if \"score\" is greater than or equal to 50 and less than or equal to 100 => ")
    public void testIsValidScoreReturnTrue() {
        message = "Course isValidScore() does not return true as expected. Make sure the conditional statement ";
        message += "\n        checks if \"score\" is greater than or equal to 50 and less than or equal to 100.";
        message += "\n       ";

        boolean firstResult = csCourse.isValidScore(50);
        boolean secondResult = csCourse.isValidScore(75);
        boolean thirdResult = csCourse.isValidScore(100);

        assertTrue(firstResult, message);
        assertTrue(secondResult, message);
        assertTrue(thirdResult, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return false if \"score\" is less than 50 and greater than 100 => ")
    public void testIsValidScoreReturnFalse() {
        message = "Course isValidScore() does not return false as expected. Make sure the conditional statement ";
        message += "\n        returns false if \"score\" is less than 50 and greater than 100.";
        message += "\n       ";

        boolean firstResult = csCourse.isValidScore(40);
        boolean secondResult = csCourse.isValidScore(50);
        boolean thirdResult = csCourse.isValidScore(110);

        assertFalse(firstResult, message);
        assertTrue(secondResult, message);
        assertFalse(thirdResult, message);
    }

}