package com.csaunit3;

/*
 * Analyzes data about basketball teams
 */
public class BasketballStats {

    private String[] teamNames;
    private int[] championshipWins;
  
    /*
     * Constructor to create an BasketballStats object with the
     * specified arrays of team names and championship wins
     */
    public BasketballStats(String[] teamNames, int[] championshipWins) {
      this.teamNames = teamNames;
      this.championshipWins = championshipWins;
    }
  
    /*
     * Returns true if there are duplicate years in
     * the championshipWins array, otherwise returns false
     */
    public boolean hasDuplicates() {
      // TO DO #1: Traverse the championshipWins array to determine if there
      // are duplicate values and return the result.
      boolean status = false;
      
      for (int start = 0; start < championshipWins.length; start++) {
        for (int next = start + 1; next < championshipWins.length; next++) {
          if (championshipWins[start] == championshipWins[next]) {
            status = true;
          }
        }
      }
  
      return status;
    }
    
  }