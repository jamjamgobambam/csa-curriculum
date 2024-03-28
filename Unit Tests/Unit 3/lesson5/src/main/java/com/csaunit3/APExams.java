package com.csaunit3;

public class APExams {

    private int[] numTests;
  
    public APExams(int[] numTests) {
      this.numTests = numTests;
    }
  
    public int calculateSum() {
      // TO DO #1-4: Traverse the numTests array using an enhanced
      // for loop and calculate the sum of the values.
  
      int sum = 0;
  
      for (int value : numTests) {
        sum += value;
      }
  
      return sum;
      
    }
    
  }