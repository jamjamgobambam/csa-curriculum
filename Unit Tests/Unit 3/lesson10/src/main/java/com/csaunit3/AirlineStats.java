package com.csaunit3;

/*
 * Analyzes data about airlines
 */
public class AirlineStats {

    private String[] airlineNames;
    private int[] yearsFounded;
  
    /*
     * Constructor to create an AirlineStats object with the specified
     * arrays of airline names and years they were founded
     */
    public AirlineStats(String[] airlineNames, int[] yearsFounded) {
      this.airlineNames = airlineNames;
      this.yearsFounded = yearsFounded;
    }
  
    /*
     * Returns true if there are duplicate years in
     * the yearsFounded array, otherwise returns false
     */
    public boolean hasDuplicates() {
      // TO DO #1: Traverse the yearsFounded array to determine if there
      // are duplicate values and return the result.
      boolean status = false;
      
      for (int start = 0; start < yearsFounded.length; start++) {
        for (int next = start + 1; next < yearsFounded.length; next++) {
          if (yearsFounded[start] == yearsFounded[next]) {
            status = true;
          }
        }
      }
  
      return status;
    }
    
  }