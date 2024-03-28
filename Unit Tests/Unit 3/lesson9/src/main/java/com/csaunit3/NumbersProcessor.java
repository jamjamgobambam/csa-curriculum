package com.csaunit3;

/*
 * Processes integer values in 1D arrays
 */
public class NumbersProcessor {

    private int[] values;  // The array of int values
  
    /*
     * Constructor to create a NumbersProcessor object
     * with a specified int array of values
     */
    public NumbersProcessor(int[] values) {
      this.values = values;
    }
  
    /*
     * Returns the values array
     */
    public int[] getValues() {
      return values;
    }
  
    /*
     * Prints the values in the array as a comma-separated list
     */
    public void printValues() {
      for (int index = 0; index < values.length; index++) {
        if (index != values.length - 1) {
          System.out.print(values[index] + ", ");
        }
        else {
          System.out.print(values[index]);
        }
      }
  
      System.out.println();
    }
  
    /*
     * Reverses the values array
     */
    public void reverse() {
      // TO DO #1: Reverse the elements in the values array.
      int back = values.length - 1;
  
      for (int front = 0; front < values.length / 2; front++) {
        int temp = values[front];
        values[front] = values[back];
        values[back] = temp;
        back--;
      }
    }
    
  }