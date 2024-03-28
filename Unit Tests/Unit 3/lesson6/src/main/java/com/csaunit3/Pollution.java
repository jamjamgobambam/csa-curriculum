package com.csaunit3;

public class Pollution {

    private double[] pollutionIndexes;
  
    // TO DO #1: Declare and initialize a constant MAX_POLLUTION.
    public static final double MAX_POLLUTION = 20;
    
  
    public Pollution(double[] pollutionIndexes) {
      this.pollutionIndexes = pollutionIndexes;
    }
  
    public int countUnderMax() {
      // TO DO #2: Traverse pollutionIndexes and count the number of
      // cities with pollution indexes less than or equal to MAX_POLLUTION.
  
      int count = 0;
  
      for (double index : pollutionIndexes) {
        if (index <= MAX_POLLUTION) {
          count++;
        }
      }
  
      return count;
    }
    
  }