package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Weather.java Test")
public class WeatherTest {
    
    double[] albany = {26.09, 31.62, 42.31, 39.07, 39.98};
    Weather albanyTemps = new Weather(albany);
    String message;

    @Test
    @DisplayName("Return the average of all values in \"temperatures\" => ")
    public void testCalculateAverage() {
        message = "Weather calculateAverage() does not return the average of all values in \"temperatures\". Create a variable to";
        message += "\n        store the sum, add each value to this variable, then return the result divided by the length of the array.";
        message += "\n       ";

        double expected = getExpectedAverage();
        double actual = albanyTemps.calculateAverage();
        assertEquals(expected, actual, message);
    }

    private double getExpectedAverage() {
        double sum = 0;

        for (double value : albany) {
            sum += value;
        }

        return sum / albany.length;
    }
}