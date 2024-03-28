package com.csaunit3;

public class Level3b {
    public static void main(String[] args) {

        double[] prices = {6.75, 8.25, 4.99, 3.25, 7.50};
        FoodTruck myFoodTruck = new FoodTruck("Kaci", prices);

        myFoodTruck.printPrices();

        // TO DO #2: Call the discountPrices() method.
        myFoodTruck.discountPrices();

        myFoodTruck.printPrices();
        
    }
    
}