package com.csaunit3;

/*
 * Manages an array of int values
 */
public class ArrayManager {

    private int[] numbers;
  
    /*
     * Creates an ArrayManager by initializing the numbers array
     */
    public ArrayManager() {
      this.numbers = createNumbers();
    }

    public int[] getNumbers() {
      return numbers;
    }
  
    /*
     * Creates and returns an int array
     */
    public int[] createNumbers() {
      // TO DO #1: Declare, initialize, and return an int array.
      int[] values = new int[10];
      return values;
    }
  
    /*
     * Returns the length of the numbers array
     */
    public int getNumbersLength() {
      // TO DO #2: Return the length of the numbers array.
      return numbers.length;
    }
    
  }