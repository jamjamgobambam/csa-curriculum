package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Rollercoasters.java Test")
public class RollercoastersTest {
    
    int[] speeds = {35, 66, 40, 50, 64, 40, 51, 47, 55, 42};
    Rollercoasters rides = new Rollercoasters(speeds);
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a constant named \"MAX_SPEED\" to 50 => ")
    public void testMaxSpeed() {
        message = "Rollercoasters \"MAX_SPEED\" is not static or is not initialized to 50.";
        message += "\n        \"MAX_SPEED\" should be a public final static variable that is initialized to 50.";
        message += "\n       ";

        int expected = 50;
        int actual = Rollercoasters.MAX_SPEED;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the number of rollercoasters that are less than or equal to \"MAX_SPEED\" => ")
    public void testCountUnderMax() {
        message = "Rollercoasters countUnderMax() does not return the number of rollercoasters that are less than or equal to \"MAX_SPEED\".";
        message += "\n        Traverse the array \"speeds\", count each value that is less than or equal to \"MAX_SPEED\" and return the result.";
        message += "\n       ";

        int expected = 6;
        int actual = rides.countUnderMax();

        assertEquals(expected, actual, message);
    }

}