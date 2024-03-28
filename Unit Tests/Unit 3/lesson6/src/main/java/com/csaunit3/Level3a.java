package com.csaunit3;

public class Level3a {
    public static void main(String[] args) {
        
        FoodTruck rosiesFoodTruck = new FoodTruck("Rosie");
        FoodTruck erinsFoodTruck = new FoodTruck("Erin");

        // TO DO #2: Print the value of businessName for each FoodTruck object.
        System.out.println(rosiesFoodTruck.getOwner() + "'s Food Truck: " + FoodTruck.businessName);
        System.out.println(erinsFoodTruck.getOwner() + "'s Food Truck: " + FoodTruck.businessName);

        // TO DO #3: Change businessName to a different name then print the
        // new value of businessName for each FoodTruck object.
        FoodTruck.businessName = "The Neighborhood Food Truck";
        System.out.println(rosiesFoodTruck.getOwner() + "'s Food Truck: " + FoodTruck.businessName);
        System.out.println(erinsFoodTruck.getOwner() + "'s Food Truck: " + FoodTruck.businessName);
        
    }
}