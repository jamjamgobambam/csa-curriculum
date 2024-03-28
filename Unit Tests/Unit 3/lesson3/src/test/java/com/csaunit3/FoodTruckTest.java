package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("FoodTruck.java Test")
public class FoodTruckTest {
    
    @Test
    @DisplayName("Modify the array \"prices\" to set each value to half of the original value => ")
    public void testDiscountPrices() {
        String message = "FoodTruck discountPrices() does not update the values in the array \"prices\".";
        message += "\n        Set each value in \"prices\" to half of the current value.";
        message += "\n       ";

        double[] prices = {6.75, 8.25, 4.99, 3.25, 7.50};
        FoodTruck myFoodTruck = new FoodTruck("Kaci", prices);

        double[] expected = {3.375, 4.125, 2.495, 1.625, 3.75};
        myFoodTruck.discountPrices();
        double[] actual = myFoodTruck.getPrices();
        assertArrayEquals(expected, actual, message);
    }

}