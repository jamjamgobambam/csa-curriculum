package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Crops.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class CropsTest {
    
    String[] cropsList = {"tomatoes", "strawberries", "carrots", "apples", "sweet potatoes"};
    int[] yieldsList = {968079, 650772, 463819, 394802, 212510};
    Crops myCrops = new Crops(cropsList, yieldsList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if at least one value in \"yields\" is greater than the parameter \"valueToFind\" => ")
    public void testHastAtLeastGreaterThanValueToFind() {
        message = "Crops hasAtLeast() does not return true if at least one value in \"yields\" is greater than the parameter \"valueToFind\".";
        message += "\n        Find the first value that is greater than the parameter \"valueToFind\" and return the result.";
        message += "\n       ";

        assertTrue(myCrops.hasAtLeast(650000), message);
    }

    @Test
    @Order(2)
    @DisplayName("Return true if at least one value in \"yields\" is equal to the parameter \"valueToFind\" => ")
    public void testHasAtLeastEqualToValueToFind() {
        message = "Crops hasAtLeast() does not return true if at least one value in \"yields\" is greater than the parameter \"valueToFind\".";
        message += "\n        Find the first value that is equal to the parameter \"valueToFind\" and return the result.";
        message += "\n       ";

        assertTrue(myCrops.hasAtLeast(212510), message);
    }

    @Test
    @Order(3)
    @DisplayName("Return false is no values in \"yields\" is greater than or equal to the parameter \"valueToFind\" => ")
    public void testHasAtLeastReturnsFalse() {
        message = "Crops hasAtLeast() does not return false if no values in \"yields\" are greater than or equal to the parameter \"valueToFind\".";
        message += "\n        Check if any values in \"yields\" are greater than or equal to the parameter \"valueToFind\" and return false if none are found.";
        message += "\n       ";

        assertFalse(myCrops.hasAtLeast(990000), message);
    }

}