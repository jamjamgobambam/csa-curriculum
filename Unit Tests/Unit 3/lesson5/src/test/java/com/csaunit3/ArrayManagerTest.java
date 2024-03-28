package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("ArrayManager.java Test")
public class ArrayManagerTest {
    
    int[] values = {25, 82, 94, 13, 38};
    ArrayManager manager;
    String message;

    @BeforeEach
    public void setup() {
        manager = new ArrayManager(values);
    }

    @Test
    @Order(1)
    @DisplayName("\"numbers\" contains the values [25, 82, 94, 13, 38] => ")
    public void testNumbersContents() {
        message = "ArrayManager getNumbers() does not return the expected values in the array \"numbers\".";
        message += "\n       ";

        int[] actual = manager.getNumbers();
        assertArrayEquals(values, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return a String containing the values in \"numbers\" using an enhanced for loop => ")
    public void testNumbersToStringEnhanced() {
        message = "ArrayManager numbersToStringEnhanced() does not return a String containing the values in \"numbers\".";
        message += "\n       ";
        
        String expected = "25\n82\n94\n13\n38\n";
        String actual = manager.numbersToStringEnhanced();
        assertEquals(expected, actual, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return a String containing the values in \"numbers\" using a regular for loop => ")
    public void testNumbersToStringRegular() {
        message = "ArrayManager numbersToStringRegular() does not return a String containing the values in \"numbers\".";
        message += "\n       ";
        
        String expected = "25\n82\n94\n13\n38\n";
        String actual = manager.numbersToStringRegular();
        assertEquals(expected, actual, message);
    }

}