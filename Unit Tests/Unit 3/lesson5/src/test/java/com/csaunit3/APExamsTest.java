package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("APExams.java Test")
public class APExamsTest {
    
    int[] totalCSExams = {29047, 11969, 12811, 12394, 7658};
    APExams totalStats = new APExams(totalCSExams);
    String message;

    @Test
    @DisplayName("Return the sum of all values in \"numTests\" => ")
    public void testCalculateSum() {
        message = "APStates calculateSum() does not return the sum of all values in \"numTests\". Create a";
        message += "\n        variable to store the sum, add each value to this variable, then return the result.";
        message += "\n       ";

        int expected = getExpectedSum();
        int actual = totalStats.calculateSum();
        assertEquals(expected, actual, message);
    }

    private int getExpectedSum() {
        int sum = 0;

        for (int value : totalCSExams) {
            sum += value;
        }

        return sum;
    }
}