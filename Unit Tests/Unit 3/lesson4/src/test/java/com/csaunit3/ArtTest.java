package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Art.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class ArtTest {
    
    String[] artworkList = {"Once Upon a Time", "Photo Booth", "Red Barn Door", "Our House", "The World"};
    int[] yearsList = {2008, 2008, 2008, 2007, 2006};
    Art myArt = new Art(artworkList, yearsList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if at least one value in \"years\" is equal to the parameter \"yearToFind\" => ")
    public void testHasYearReturnsTrue() {
        message = "Art hasYear() does not return true if at least one value in \"years\" is equal to the parameter \"yearToFind\".";
        message += "\n        Find the first value that is equal to the parameter \"yearToFind\" and return the result.";
        message += "\n       ";

        assertTrue(myArt.hasYear(2007), message);
    }

    @Test
    @Order(2)
    @DisplayName("Return false if no values in \"years\" is equal to the parameter \"yearToFind\" => ")
    public void testHasYearReturnsFalse() {
        message = "Art hasYear() does not return false if no values in \"years\" are equal to the parameter \"yearToFind\".";
        message += "\n        Check if any values in \"years\" are equal to the parameter \"yearToFind\" and return false if none are found.";
        message += "\n       ";

        assertFalse(myArt.hasYear(2010), message);
    }
    
}