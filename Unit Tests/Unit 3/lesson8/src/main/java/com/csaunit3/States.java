package com.csaunit3;

/*
 * Analyzes data about states in the USA
 */
public class States {

    private String[] stateNames;  // The array of state names
    private int[] data;           // The array of data to analyze
  
    /*
     * Constructor to create a States object with the
     * specified arrays of state names and data
     */
    public States(String[] stateNames, int[] data) {
      this.stateNames = stateNames;
      this.data = data;
    }
  
    /*
     * Prints each pair of states, the description of the data, and whether or not the first
     * state's data value is greater than the second state's data value
     */
    public void printPairs(String description) {
      for (int index = 0; index < stateNames.length; index++) {
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
  
  }