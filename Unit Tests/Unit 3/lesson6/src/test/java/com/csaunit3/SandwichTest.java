package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sandwich.java Test")
public class SandwichTest {
    
    @Test
    @DisplayName("The constant \"PRICE\" is initialized to 2.75 => ")
    public void testPriceValue() {
        String message = "Sandwich \"PRICE\" is not initialized to 2.75.";
        message += "\n       ";
        
        assertEquals(2.75, Sandwich.PRICE, message);
    }
}