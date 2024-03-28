package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Dessert.java Test")
public class DessertTest {
    
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a static variable called \"totalDesserts\" => ")
    public void testTotalDesserts() {
        message = "Dessert \"totalDesserts\" is not static or is not initialized to 0.";
        message += "\n        \"totalDesserts\" should be a public static variable that is initialized to 0.";
        message += "\n       ";

        int expected = 0;
        int actual = Dessert.totalDesserts;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("\"totalDesserts\" increases by 1 when a Dessert object is instantiated with the no-argument constructor => ")
    public void testTotalDessertsIncrementsNoArgConstructor() {
        message = "\"totalDesserts\" does not increase by 1 when a Dessert object is instantiated with the no-argument constructor.";
        message += "\n        In the no-argument constructor, increment the static variable \"totalDesserts\" by 1.";
        message += "\n       ";

        int expected = 1;
        Dessert firstDessert = new Dessert();
        firstDessert.getFlavor();
        int actual = Dessert.totalDesserts;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("\"totalDesserts\" increases by 1 when a Dessert object is instantiated with the parameterized constructor => ")
    public void testTotalDessertsIncrementsParameterizedConstructor() {
        message = "\"totalDesserts\" does not increase by 1 when a Dessert object is instantiated with the parameterized constructor.";
        message += "\n        In the parameterized constructor, increment the static variable \"totalDesserts\" by 1.";
        message += "\n       ";

        int expected = 1;
        Dessert.totalDesserts = 0;
        Dessert secondDessert = new Dessert("chocolate", 2.99);
        secondDessert.getFlavor();
        int actual = Dessert.totalDesserts;

        assertEquals(expected, actual, message);
    }

}