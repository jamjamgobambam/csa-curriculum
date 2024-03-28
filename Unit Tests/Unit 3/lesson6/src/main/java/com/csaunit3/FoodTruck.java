package com.csaunit3;

/*
 * Represents a single Food Truck at the
 * Project Mercury Pastries Food Truck business
 */
public class FoodTruck {

    private String owner;        // The owner of the Food Truck
  
    // TO DO #1: Declare and initialize a static variable called businessName.
    public static String businessName = "Project Mercury Pastries Food Truck";
  
    /*
     * Creates a Food Truck with the specified owner
     */
    public FoodTruck(String owner) {
      this.owner = owner;
    }

    public String getOwner() {
      return owner;
    }
  
  }