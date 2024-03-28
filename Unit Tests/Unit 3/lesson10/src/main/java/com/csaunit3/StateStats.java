package com.csaunit3;

/*
 * Analyzes data about states
 */
public class StateStats {

    private String[] stateNames;
    private int[] admissionYears;
  
    /*
     * Constructor to create an StateStats object with the specified
     * arrays of state names and years they were admitted
     */
    public StateStats(String[] stateNames, int[] admissionYears) {
      this.stateNames = stateNames;
      this.admissionYears = admissionYears;
    }
  
    /*
     * Returns true if there are duplicate years in
     * the admissionYears array, otherwise returns false
     */
    public boolean hasDuplicates() {
      // TO DO #1: Traverse the admissionYears array to determine if there
      // are duplicate values and return the result.
      boolean status = false;
      
      for (int start = 0; start < admissionYears.length; start++) {
        for (int next = start + 1; next < admissionYears.length; next++) {
          if (admissionYears[start] == admissionYears[next]) {
            status = true;
          }
        }
      }
  
      return status;
    }
    
  }