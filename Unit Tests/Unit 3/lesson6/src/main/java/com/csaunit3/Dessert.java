package com.csaunit3;

/*
 * A Dessert that the Project Mercury Pastries Food Truck sells
 */
public class Dessert {

    private String flavor;  // The flavor of the Dessert
    private double price;   // The price of the Dessert
  
    public static int totalDesserts = 0;   // The total number of Dessert objects created
  
    /*
     * Constructor to create a plain Dessert
     */
    public Dessert() {
      flavor = "plain";
      price = 0.00;
  
      totalDesserts++;
    }
  
    /*
     * Constructor create a Dessert with
     * specified flavor and price
     */
    public Dessert(String newFlavor, double newPrice) {
      flavor = newFlavor;
      price = newPrice;
  
      totalDesserts++;
    }
  
    /*
     * Returns the current value of flavor
     */
    public String getFlavor() {
      return flavor;
    }
  
    /*
     * Returns the current value of price
     */
    public double getPrice() {
      return price;
    }
  
    /*
     * Updates the flavor to the new flavor given
     */
    public void setFlavor(String newFlavor) {
      flavor = newFlavor;
    }
  
    /*
     * Updates the price to the new price given
     */
    public void setPrice(double newPrice) {
      if (newPrice >= 0) {
        price = newPrice;
      }
    }
  
    /*
     * Returns a string containing the flavor and price
     */
    public String toString() {
      return "Flavor: " + flavor + "\nPrice: " + price;
    }
    
  }