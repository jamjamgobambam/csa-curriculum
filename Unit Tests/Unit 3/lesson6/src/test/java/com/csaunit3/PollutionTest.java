package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Pollution.java Test")
public class PollutionTest {
    
    double[] pollutionIndexes = {30.93, 26.86, 17.33, 19.63, 21.24, 13.08, 39.41, 65.19, 24.26, 25.9};
    Pollution cityIndexes = new Pollution(pollutionIndexes);
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a constant named \"MAX_POLLUTION\" to 20 => ")
    public void testMaxPollution() {
        message = "Pollution \"MAX_POLLUTION\" is not static or is not initialized to 20.";
        message += "\n        \"MAX_POLLUTION\" should be a public final static variable that is initialized to 20.";
        message += "\n       ";

        double expected = 20;
        double actual = Pollution.MAX_POLLUTION;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the number of cities that have pollution indexes less than or equal to \"MAX_POLLUTION\" => ")
    public void testCountUnderMax() {
        message = "Pollution countUnderMax() does not return the number of cities that have pollution indexes less than or equal to \"MAX_SPEED\".";
        message += "\n        Traverse the array \"pollutionIndexes\", count each value that is less than or equal to \"MAX_POLLUTION\" and return the result.";
        message += "\n       ";

        int expected = 3;
        int actual = cityIndexes.countUnderMax();

        assertEquals(expected, actual, message);
    }
    
}