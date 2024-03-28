package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TexasWeather.java Test")
public class TexasWeatherTest {
    
    @Test
    @DisplayName("Return a String containing the values in the array \"temperatures\" => ")
    public void testGetTemperatures() {
        String message = "TexasWeather getTemperatures() does not return a String containing each value in \"temperatures\".";
        message += "\n        Make sure the current values are being added to the \"result\" String and that the loop is correct.";
        message += "\n       ";

        double[] dfwTemperatures = {72.13, 61.69, 59.58, 60.15, 66.41};
        TexasWeather dfw = new TexasWeather("Dallas-Fort Worth", dfwTemperatures);

        String expected = "72.13 61.69 59.58 60.15 66.41";
        String actual = dfw.getTemperatures();
        assertEquals(expected, actual.trim(), message);
    }
}