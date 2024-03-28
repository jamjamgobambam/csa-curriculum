package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("States.java Test")
public class StatesTest {
    
    String[] favStates = {"California", "Texas", "New York", "Florida", "Illinois"};
    States myStates = new States(favStates);
    String message;

    @Test
    @DisplayName("Return a String containing each state name in \"names\" => ")
    public void testGetStates() {
        message = "States getStates() does not return a String containing each state name in \"names\".";
        message += "\n        Check that each value in the array \"names\" is concatenated to the String \"result\".";
        message += "\n       ";

        String expected = "California Texas New York Florida Illinois";
        String actual = myStates.getStates();
        assertEquals(expected, actual.trim(), message);
    }
}