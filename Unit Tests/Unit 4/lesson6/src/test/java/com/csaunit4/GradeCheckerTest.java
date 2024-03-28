package com.csaunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("GradeChecker.java Test")
public class GradeCheckerTest {

    String message;

    @Test
    @Order(1)
    @DisplayName("Return \"A\" if \"score\" is greater than or equal to 90 and less than or equal to 100 => ")
    public void testGetLetterGradeReturnsA() {
        message = "GradeChecker getLetterGrade() does not return \"A\" as expected. Make sure the conditional statement ";
        message += "\n        checks if \"score\" is greater than or equal to 90 and less than or equal to 100.";
        message += "\n       ";

        String firstScore = GradeChecker.getLetterGrade(90);
        String secondScore = GradeChecker.getLetterGrade(95);
        String thirdScore = GradeChecker.getLetterGrade(100);

        assertEquals("A", firstScore, message);
        assertEquals("A", secondScore, message);
        assertEquals("A", thirdScore, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return \"B\" if \"score\" is greater than or equal to 80 and less than 90 => ")
    public void testGetLetterGradeReturnsB() {
        message = "GradeChecker getLetterGrade() does not return \"B\" as expected. Make sure the conditional statement ";
        message += "\n        checks if \"score\" is greater than or equal to 80 and less than 90.";
        message += "\n       ";

        String firstScore = GradeChecker.getLetterGrade(80);
        String secondScore = GradeChecker.getLetterGrade(85);
        String thirdScore = GradeChecker.getLetterGrade(90);

        assertEquals("B", firstScore, message);
        assertEquals("B", secondScore, message);
        assertNotEquals("B", thirdScore, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return \"C\" if \"score\" is greater than or equal to 70 and less than 80 => ")
    public void testGetLetterGradeReturnsC() {
        message = "GradeChecker getLetterGrade() does not return \"C\" as expected. Make sure the conditional statement ";
        message += "\n        checks if \"score\" is greater than or equal to 70 and less than 80.";
        message += "\n       ";

        String firstScore = GradeChecker.getLetterGrade(70);
        String secondScore = GradeChecker.getLetterGrade(75);
        String thirdScore = GradeChecker.getLetterGrade(80);

        assertEquals("C", firstScore, message);
        assertEquals("C", secondScore, message);
        assertNotEquals("C", thirdScore, message);
    }

    @Test
    @Order(4)
    @DisplayName("Return \"D\" if \"score\" is greater than or equal to 60 and less than 70 => ")
    public void testGetLetterGradeReturnsD() {
        message = "GradeChecker getLetterGrade() does not return \"D\" as expected. Make sure the conditional statement ";
        message += "\n        checks if \"score\" is greater than or equal to 60 and less than 70.";
        message += "\n       ";

        String firstScore = GradeChecker.getLetterGrade(60);
        String secondScore = GradeChecker.getLetterGrade(65);
        String thirdScore = GradeChecker.getLetterGrade(70);

        assertEquals("D", firstScore, message);
        assertEquals("D", secondScore, message);
        assertNotEquals("D", thirdScore, message);
    }

}