package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("OnlinePurchases.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class OnlinePurchasesTest {
    
    OnlinePurchases customer;
    double[] purchases = {14.75, 12.98, 45.67, 32.50, 15.75};
    String message;

    @BeforeEach
    public void setup() {
        customer = new OnlinePurchases(purchases);
    }

    @Test
    @Order(1)
    @DisplayName("Return the value in \"purchases\" at the parameter \"index\" => ")
    public void testGetPurchase() {
        message = "OnlinePurchases getPurchase() does not return the value in \"purchases\" at the parameter \"index\".";
        message += "\n        Get the value at \"index\" from the array \"purchases\" and return the result.";
        message += "\n       ";

        double expected = purchases[1];
        double actual = customer.getPurchase(1);
        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Change the value in \"purchases\" at the parameter \"index\" to \"newValue\" => ")
    public void testSetPurchase() {
        message = "OnlinePurchases setPurchase() does change the value in \"purchases\" at the parameter \"index\" to \"newValue\".";
        message += "\n        Access the element at \"index\" in \"purchases\" and set it to the new value passed to \"newValue\".";
        message += "\n       ";

        double[] expected = {14.75, 25.86, 45.67, 32.50, 15.75};
        customer.setPurchase(1, 25.86);
        double[] newPurchases = customer.getPurchases();
        assertArrayEquals(expected, newPurchases, message);
    }
}