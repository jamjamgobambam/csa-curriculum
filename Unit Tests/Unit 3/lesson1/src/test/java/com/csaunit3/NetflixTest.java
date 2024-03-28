package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Netflix.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class NetflixTest {
    
    double[] netflixFees = {7.11, 11.87, 15.24, 6.61, 13.13, 10.43, 10.05, 14.67, 13.99, 10.99};
    Netflix fees = new Netflix(netflixFees);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return the instance variable \"data\" => ")
    public void testGetData() {
        message = "Netflix getData() does not return the instance variable \"data\".";
        message += "\n        ";

        double[] result = fees.getData();
        assertArrayEquals(netflixFees, result, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the length of the instance variable \"data\" => ")
    public void testGetDataLength() {
        message = "Netflix getDataLength() does not return the length of the instance variable \"data\".";
        message += "\n        ";
        
        int result = fees.getDataLength();
        assertEquals(netflixFees.length, result, message);
    }
}