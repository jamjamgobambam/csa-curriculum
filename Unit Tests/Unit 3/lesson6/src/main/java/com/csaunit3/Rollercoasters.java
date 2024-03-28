package com.csaunit3;

public class Rollercoasters {

    private int[] speeds;
  
    // TO DO #1: Declare and initialize a constant MAX_SPEED.
    public static final int MAX_SPEED = 50;
    
  
    public Rollercoasters(int[] speeds) {
      this.speeds = speeds;
    }
  
    public int countUnderMax() {
      // TO DO #2: Traverse speeds and count the number of
      // rollercoasters with speeds less than or equal to MAX_SPEED.
  
      int count = 0;
  
      for (int value : speeds) {
        if (value <= MAX_SPEED) {
          count++;
        }
      }
  
      return count;
    }
    
  }