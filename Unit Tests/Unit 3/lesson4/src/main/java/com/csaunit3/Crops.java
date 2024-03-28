package com.csaunit3;

/*
 * Stores and analyzes the list of
 * crops and their annual yields
 */
public class Crops {

    private String[] types;   // The list of crops
    private int[] yields;      // The yield in hectograms
  
    /*
     * Constructor to create a CropsStats object with
     * specified crops and yields arrays
     */
    public Crops(String[] types, int[] yields) {
      this.types = types;
      this.yields = yields;
    }

    public String[] getTypes() {
      return types;
    }

    public int[] getYields() {
      return yields;
    }
  
    /*
     * Checks if yields array contains at least one value
     * that is greater than valueToFind
     */
    public boolean hasAtLeast(int valueToFind) {
      // TO DO #1: Check if yields array contains at least
      // one value that is greater than valueToFind.
  
      for (int index = 0; index < yields.length; index++) {
        if (yields[index] >= valueToFind) {
          return true;
        }
      }
  
      return false;
      
    }
  }