package com.csaunit3;

public class Basketball {

    private int[] championshipWins;
  
    // TO DO #1: Declare and initialize a constant MIN_WINS.
    public static final int MIN_WINS = 2;
    
  
    public Basketball(int[] championshipWins) {
      this.championshipWins = championshipWins;
    }
  
    public int countOverMin() {
      // TO DO #2: Traverse championshipWins and count the number of
      // teams with wins greater than or equal to MIN_WINS.
  
      int count = 0;
      
      for (int wins : championshipWins) {
        if (wins >= MIN_WINS) {
          count++;
        }
      }
  
      return count;
    }
    
  }