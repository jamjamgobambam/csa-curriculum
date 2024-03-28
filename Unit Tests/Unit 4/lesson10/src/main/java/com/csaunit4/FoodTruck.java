package com.csaunit4;

/*
 * Represents a food truck
 */
public final class FoodTruck {

    /*
     * Prints a message with the appropriate discount
     * based on the given quantity
     */
    public static void chooseDiscount(int quantity) {
      // TO DO #1: Use multi-selection statements to print
      // the correct message based on the quantity.
  
      if (quantity % 12 == 0) {
        System.out.println("15% discount");
      }
      else if (quantity % 6 == 0) {
        System.out.println("10% discount");
      }
      else {
        System.out.println("No discount");
      }
    }
    
  }