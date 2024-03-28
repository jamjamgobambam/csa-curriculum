package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("FoodTruck.java Test")
public class FoodTruckTest {

    String message;
    
    @Test
    @Order(1)
    @DisplayName("Declare and initialize a static variable called \"businessName\" => ")
    public void testBusinessName() {
        message = "FoodTruck \"businessName\" is not static or is not initialized to \"Project Mercury Pastries Food Truck\".";
        message += "\n        \"businessName\" should be a public static variable that is initialized to \"Project Mercury Pastries Food Truck\".";
        message += "\n       ";

        String expected = "Project Mercury Pastries Food Truck";
        String actual = FoodTruck.businessName;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Static variable \"businessName\" can be set to a new value => ")
    public void testBusinessNameNewValue() {
        message = "FoodTruck \"businessName\" cannot be changed to a new value.";
        message += "\n        \"businessName\" should be a public static variable.";
        message += "\n       ";

        String expected = "My New Food Truck Name";
        FoodTruck.businessName = "My New Food Truck Name";
        String actual = FoodTruck.businessName;

        assertEquals(expected, actual, message);
    }

}