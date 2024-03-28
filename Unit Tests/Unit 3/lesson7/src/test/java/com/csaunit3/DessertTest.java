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
    
    Dessert first = new Dessert("vanilla", 2.99, 4);
    Cookie second = new Cookie("oatmeal", 1.50, 12, 6, true);
    Pie third = new Pie("cherry", 4.75, 4, "cherry", true);
    Dessert[] dessertsList = {first, second, third};
    String message;

    @Test
    @Order(1)
    @DisplayName("Return a String containing the flavor of each dessert and the total price of the order => ")
    public void testGetDessertsInfo() {
        message = "Dessert getDessertsInfo() does not return a String containing the flavor of each dessert and the.";
        message += "\n        total price of the order. Traverse the \"dessertList\" array and concatenate each flavor and total price to the \"result\".";
        message += "\n       ";

        String expected = getExpectedDessertsInfo();
        String actual = first.getDessertsInfo(dessertsList);

        assertEquals(expected, actual, message);
    }

    private String getExpectedDessertsInfo() {
        return "vanilla: 11.96\n" + 
            "oatmeal: 13.5\n" + 
            "cherry: 15.200000000000001\n";
    }
}