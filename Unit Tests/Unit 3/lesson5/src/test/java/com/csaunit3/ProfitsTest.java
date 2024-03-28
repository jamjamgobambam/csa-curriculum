package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Profits.java Test")
public class ProfitsTest {
    
    double[] profitsList = {-10.80, -26.88, 17.60, 2.10, 68, 19.73, -11.99, 103.80, 6, 15.24, 236.23, 1.36, -1360};
    Profits techProfits = new Profits(profitsList);
    String message;

    @Test
    @DisplayName("Return the sum of all positive values in \"dailyProfits\" => ")
    public void testCalculatePositiveSum() {
        message = "Profits calculatePositiveSum() does not return the sum of all positive values in \"dailyProfits\". Create a";
        message += "\n        variable to store the sum, add each value to this variable if it is positive, then return the result.";
        message += "\n       ";

        double expected = getExpectedPositiveSum();
        double actual = techProfits.calculatePositiveSum();
        assertEquals(expected, actual, message);
    }

    private double getExpectedPositiveSum() {
        double sum = 0;

        for (double value : profitsList) {
            if (value > 0) {
                sum += value;
            }
        }

        return sum;
    }
}