package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("SocialMedia.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class SocialMediaTest {
    
    SocialMedia twitter;
    String message;

    @BeforeEach
    public void setup() {
        twitter = new SocialMedia();
    }

    @Test
    @Order(1)
    @DisplayName("Declare, initialize, and return an int array => ")
    public void testCreateNumFollowers() {
        message = "SocialMedia createNumFollowers() does not return an array containing the values [15360340, 13716022, 189690, 53274, 4625].";
        message += "\n        Declare and initialize an int array to store the values then return the array.";
        message += "\n        ";

        int[] expected = {15360340, 13716022, 189690, 53274, 4625};
        int[] result = twitter.createNumFollowers();
        assertArrayEquals(expected, result, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the length of the instance variable \"numFollowers\" => ")
    public void testGetNumUsers() {
        message = "SocialMedia getNumUsers() does not return the length of the array \"numFollowers\".";
        message += "\n        Get the length of the array and return the result.";
        message += "\n        ";
        
        int expected;
        int result;

        try {
            expected = twitter.getNumFollowers().length;
            result = twitter.getNumUsers();
        } catch (Exception e) {
            expected = 5;
            result = 0;
        }

        assertEquals(expected, result, message);
    }

}