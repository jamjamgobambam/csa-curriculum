package com.csaunit3;

public class Netflix {

    private double[] prices;
  
    // TO DO #1: Declare and initialize a constant MAX_PRICE.
    public static final double MAX_PRICE = 12;
    
  
    public Netflix(double[] prices) {
      this.prices = prices;
    }
  
    public int countUnderMax() {
      // TO DO #2: Traverse prices and count the number of
      // countries with fees less than or equal to MAX_PRICE.
  
      int count = 0;
  
      for (double value : prices) {
        if (value <= MAX_PRICE) {
          count++;
        }
      }
  
      return count;
    }
    
  }