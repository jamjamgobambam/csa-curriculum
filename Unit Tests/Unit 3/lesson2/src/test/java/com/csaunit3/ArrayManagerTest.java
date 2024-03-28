package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ArrayManager.java Test")
public class ArrayManagerTest {
    
    @Test
    @DisplayName("Declare, initialize, and return an int array => ")
    public void testCreateNumbers() {
        String message = "ArrayManager createNumbers() does not return an int array.";
        message += "\n        Declare and initialize an int array to store 5 elements then return the array.";
        message += "\n       ";
        
        ArrayManager data = new ArrayManager();
        int[] expected = new int[5];
        int[] result = data.createNumbers();
        assertArrayEquals(expected, result, message);
    }

}