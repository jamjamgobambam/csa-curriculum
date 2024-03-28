package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Customer.java Test")
public class CustomerTest {
    
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a static variable called \"newCustomers\" => ")
    public void testNewCustomers() {
        message = "Customer \"newCustomers\" is not static or is not initialized to 0.";
        message += "\n        \"newCustomers\" should be a public static variable that is initialized to 0.";
        message += "\n       ";

        int expected = 0;
        int actual = Customer.newCustomers;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("\"newCustomers\" increases by 1 when a Customer object is instantiated => ")
    public void testNewCustomersIncrements() {
        message = "\"newCustomers\" does not increase by 1 when a Customer object is instantiated.";
        message += "\n        In the constructor, increment the static variable \"newCustomers\" by 1.";
        message += "\n       ";

        int expected = 1;
        Customer firstCustomer = new Customer("Sara", 4);
        firstCustomer.getName();
        int actual = Customer.newCustomers;

        assertEquals(expected, actual, message);
    }

}