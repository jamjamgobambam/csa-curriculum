package com.csaunit3;

/*
 * Represents a single Food Truck at the
 * Project Mercury Pastries Food Truck business
 */
public class FoodTruck {

    private String owner;        // The owner of the Food Truck
    private double[] prices;       // The prices of desserts at the Food Truck
  
    /*
     * Creates a Food Truck with the specified owner and array of prices
     */
    public FoodTruck(String owner, double[] prices) {
      this.owner = owner;
      this.prices = prices;
    }
  
    /*
     * Returns the name of the owner
     */
    public String getOwner() {
      return owner;
    }
  
    /*
     * Returns the prices array
     */
    public double[] getPrices() {
      return prices;
    }
  
    /*
     * Updates the values in prices to half off
     */
    public void discountPrices() {
      // TO DO #1: Update the values in the prices array
      // to half of the original prices.
  
      for (int index = 0; index < prices.length; index++) {
        prices[index] /= 2;
      }
      
    }
  
    /*
     * Prints the values in the prices array
     */
    public void printPrices() {
      for (int index = 0; index < prices.length; index++) {
        System.out.println(prices[index]);
      }
    }
  
  }