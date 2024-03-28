package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ArrayPrinter.java Test")
public class ArrayPrinterTest {
    
    @Test
    @DisplayName("Return a String containing the values in the array \"numbers\" => ")
    public void testGetNumbers() {
        String message = "ArrayPrinter getNumbers() does not return a String containing each value in \"numbers\".";
        message += "\n        Make sure the current values are being added to the \"result\" String and that the loop is correct.";
        message += "\n       ";

        int[] numbers = {2, 4, 6, 8, 10};
        ArrayPrinter myArray = new ArrayPrinter(numbers);
        
        String expected = "2 4 6 8 10";
        String actual = myArray.getNumbers();
        assertEquals(expected, actual.trim(), message);
    }

}