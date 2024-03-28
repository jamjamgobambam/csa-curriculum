package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Netflix.java Test")
public class NetflixTest {
    
    double[] pricesList = {11.87, 12.99, 15.24, 14.67, 6.61, 13.13, 12.53, 8.56, 13.2, 13.99};
    Netflix countryPrices = new Netflix(pricesList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a constant named \"MAX_PRICE\" to 12 => ")
    public void testMaxPrice() {
        message = "Netflix \"MAX_PRICE\" is not static or is not initialized to 12.";
        message += "\n        \"MAX_PRICE\" should be a public final static variable that is initialized to 12.";
        message += "\n       ";

        double expected = 12;
        double actual = Netflix.MAX_PRICE;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the number of countries with subscription fees less than or equal to \"MAX_PRICE\" => ")
    public void testCountUnderMax() {
        message = "Netflix countUnderMax() does not return the number of countries with subscription fees less than or equal to \"MAX_PRICE\".";
        message += "\n        Traverse the array \"prices\", count each value that is less than or equal to \"MAX_PRICE\" and return the result.";
        message += "\n       ";

        int expected = 3;
        int actual = countryPrices.countUnderMax();

        assertEquals(expected, actual, message);
    }
    
}