package com.csaunit3;

public class Level3a {
    public static void main(String[] args) {

        String[] cropsList = {"tomatoes", "strawberries", "carrots", "apples", "sweet potatoes"};
        int[] yieldsList = {968079, 650772, 463819, 394802, 212510};

        Crops myCrops = new Crops(cropsList, yieldsList);

        System.out.println("My crops has a yield of at least 600000: " + myCrops.hasAtLeast(6000));

    }
}