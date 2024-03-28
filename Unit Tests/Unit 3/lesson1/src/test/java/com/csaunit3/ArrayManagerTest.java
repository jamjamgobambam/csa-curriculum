package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("ArrayManager.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class ArrayManagerTest {

    ArrayManager data;
    String message;

    @BeforeEach
    public void setup() {
        data = new ArrayManager();
    }
    
    @Test
    @Order(1)
    @DisplayName("Declare, initialize, and return an int array => ")
    public void testCreateNumbers() {
        message = "ArrayManager createNumbers() does not return an int array.";
        message += "\n        Declare and initialize an int array to store 10 elements then return the array.";
        message += "\n        ";
        
        int[] expected = new int[10];
        int[] result = data.createNumbers();
        assertArrayEquals(expected, result, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the length of the instance variable \"numbers\" => ")
    public void testGetNumbersLength() {
        message = "ArrayManager getNumbersLength() does not return the length of the array \"numbers\".";
        message += "\n        Get the length of the array and return the result.";
        message += "\n        ";

        int expected;
        int result;

        try {
            expected = data.getNumbers().length;
            result = data.getNumbersLength();
        } catch (Exception e) {
            expected = 10;
            result = 0;
        }

        assertEquals(expected, result, message);
    }

}