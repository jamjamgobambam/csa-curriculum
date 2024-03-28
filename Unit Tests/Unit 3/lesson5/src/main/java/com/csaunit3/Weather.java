package com.csaunit3;

public class Weather {

    private double[] temperatures;
  
    public Weather(double[] temperatures) {
      this.temperatures = temperatures;
    }
  
    public double calculateAverage() {
      // TO DO #1-4: Traverse the temperatures array using an enhanced
      // for loop to calculate the average of the values.
  
      double sum = 0;
  
      for (double value : temperatures) {
        sum += value;
      }
  
      return sum / temperatures.length;
      
    }
    
  }