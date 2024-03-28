package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Planets.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class PlanetsTest {
    
    String[] planetsList = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    double[] dayLengthsList = {4222.6, 2802.0, 24, 24.7, 9.9, 10.7, 17.2, 16.1, 153.3};
    Planets myPlanets = new Planets(planetsList, dayLengthsList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if at least one value in \"dayLengths\" is less than the parameter \"valueToFind\" => ")
    public void testHasDayLengthReturnsTrue() {
        message = "Planets hasDayLength() does not return true if at least one value in \"dayLengths\" is less than the parameter \"valueToFind\".";
        message += "\n        Find the first value that is equal to the parameter \"valueToFind\" and return the result.";
        message += "\n       ";

        assertTrue(myPlanets.hasDayLength(24), message);
    }

    @Test
    @Order(2)
    @DisplayName("Return false if no values in \"dayLengths\" is less than the parameter \"valueToFind\" => ")
    public void testHasDayLengthReturnsFalse() {
        message = "Planets hasDayLength() does not return false if no values in \"dayLengths\" are less than the parameter \"valueToFind\".";
        message += "\n        Check if any values in \"dayLengths\" are less than the parameter \"valueToFind\" and return false if none are found.";
        message += "\n       ";

        assertFalse(myPlanets.hasDayLength(8), message);
    }

}