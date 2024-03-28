package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Elements.java Test")
public class ElementsTest {
    
    double[] meltingList = {-434.81, -458, 356.9, 2349, 3767, 6422, -346, -361.82, -363.32, -415.46};
    Elements firstTenElements = new Elements(meltingList);
    String message;

    @Test
    @DisplayName("Return the average of all positive values in \"meltingPoints\" => ")
    public void testCalculatePositiveAverage() {
        message = "Elements calculatePositiveAverage() does not return the average of all positive values ";
        message += "\n        in \"meltingPoints\". Create a variable to store the sum, add each value to this variable ";
        message += "\n        if it is positive. Return the result divided by the length of the array.";
        message += "\n       ";

        double expected = getExpectedPositiveAverage();
        double actual = firstTenElements.calculatePositiveAverage();
        assertEquals(expected, actual, message);
    }

    private double getExpectedPositiveAverage() {
        double sum = 0;
        int count = 0;

        for (double value : meltingList) {
            if (value > 0) {
                sum += value;
                count++;
            }
        }

        return sum / count;
    }
}