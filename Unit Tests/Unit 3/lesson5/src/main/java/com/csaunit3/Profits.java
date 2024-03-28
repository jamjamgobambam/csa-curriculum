package com.csaunit3;

public class Profits {

    private double[] profits;
  
    public Profits(double[] profits) {
      this.profits = profits;
    }
  
    public double calculatePositiveSum() {
      // TO DO #1-4: Traverse the profits array using an enhanced
      // for loop to calculate the sum of the positive values.
  
      double sum = 0;
  
      for (double value : profits) {
        if (value > 0) {
          sum += value;
        }
      }
  
      return sum;
    }
    
  }