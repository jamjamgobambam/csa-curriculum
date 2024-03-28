package com.csaunit3;

/*
 * Analyzes data about states in the USA
 */
public class States2 {

    private String[] stateNames;  // The array of state names
    private int[] data;           // The array of data to analyze
  
    /*
     * Constructor to create a States object with the
     * specified arrays of state names and data
     */
    public States2(String[] stateNames, int[] data) {
      this.stateNames = stateNames;
      this.data = data;
    }
  
    /*
     * Prints each pair of states, the description of the data, and whether or not the first
     * state's data value is greater than the second state's data value
     */
    public void printPairs(String description) {
      for (int index = 0; index < stateNames.length - 1; index++) {
        System.out.print(stateNames[index] + " has larger " + description + " than " + stateNames[index + 1] + ": ");
        System.out.println(compareValues(data[index], data[index + 1]));
      }
    }
  
    /*
     * Returns true if the first value is greater than the
     * second value, otherwise returns false
     */
    public boolean compareValues(int first, int second) {
      if (first > second) {
        return true;
      }
  
      return false;
    }
  
    /*
     * Returns the largest value in the data array
     */
    public int getMax() {
      // TO DO #1: Traverse the data array to find the largest value.
      int max = data[0];
  
      for (int index = 1; index < data.length; index++) {
        if (data[index] > max) {
          max = data[index];
        }
      }
  
      return max;
    }
  
    /*
     * Returns the smallest value in the data array
     */
    public int getMin() {
      // TO DO #2: Traverse the data array to find the smallest value.
      int min = data[0];
  
      for (int index = 1; index < data.length; index++) {
        if (data[index] < min) {
          min = data[index];
        }
      }
  
      return min;
    }
    
  }