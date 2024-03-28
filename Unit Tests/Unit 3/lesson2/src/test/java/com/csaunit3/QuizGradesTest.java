package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("QuizGrades.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class QuizGradesTest {
    
    QuizGrades teacher;
    int[] grades = {85, 97, 82, 79, 95};
    String message;

    @BeforeEach
    public void setup() {
        teacher = new QuizGrades(grades);
    }

    @Test
    @Order(1)
    @DisplayName("Return the value in \"grades\" at the parameter \"index\" => ")
    public void testGetGrade() {
        message = "QuizGrades getGrade() does not return the value in \"grades\" at the parameter \"index\".";
        message += "\n        Get the value at \"index\" from the array \"grades\" and return the result.";
        message += "\n       ";

        int expected = grades[1];
        int actual = teacher.getGrade(1);
        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Change the value in \"grades\" at the parameter \"index\" to \"newValue\" => ")
    public void testSetGrade() {
        message = "QuizGrades setGrade() does change the value in \"grades\" at the parameter \"index\" to \"newValue\".";
        message += "\n        Access the element at \"index\" in \"grades\" and set it to the new value passed to \"newValue\".";
        message += "\n       ";

        int[] expected = {85, 97, 90, 79, 95};
        teacher.setGrade(2, 90);
        int[] newGrades = teacher.getAllGrades();
        assertArrayEquals(expected, newGrades, message);
    }

}