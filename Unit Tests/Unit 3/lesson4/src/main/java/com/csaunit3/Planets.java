package com.csaunit3;

/*
 * Stores and analyzes the list of planets
 * and whether or not they have ring systems
 */
public class Planets {

    private String[] names;         // The list of planets
    private double[] dayLengths;    // The length of day for each planet
  
    /*
     * Constructor to create a PlanetsStats object with
     * specified names and ring systems
     */
    public Planets(String[] names, double[] dayLengths) {
      this.names = names;
      this.dayLengths = dayLengths;
    }

    public String[] getNames() {
      return names;
    }

    public double[] getDayLengths() {
      return dayLengths;
    }
  
    /*
     * Checks if dayLengths array contains at
     * least one value that is less than valueToFind
     */
    public boolean hasDayLength(double valueToFind) {
      // TO DO #1: Check if dayLengths array contains at least
      // one value that is less than valueToFind.
  
      for (int index = 0; index < dayLengths.length; index++) {
        if (dayLengths[index] < valueToFind) {
          return true;
        }
      }
  
      return false;
    }
    
  }