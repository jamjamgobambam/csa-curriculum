package com.csaunit3;

public class Elements {

    private double[] meltingPoints;
  
    public Elements(double[] meltingPoints) {
      this.meltingPoints = meltingPoints;
    }
  
    public double calculatePositiveAverage() {
      // TO DO #1-4: Traverse the meltingPoints array using an enhanced
      // for loop to calculate the average of the positive values.
  
      double sum = 0;
      int count = 0;
  
      for (double value : meltingPoints) {
        if (value > 0) {
          sum += value;
          count++;
        }
      }
  
      return sum / count;
      
    }
    
  }