package com.csaunit3;

/*
 * Manages and outputs values in an array
 */
public class ArrayPrinter {

    private int[] numbers;
  
    /*
     * Constructor to create an ArrayPrinter with
     * a specified array of int values
     */
    public ArrayPrinter(int[] numbers) {
      this.numbers = numbers;
    }
  
    /*
     * Returns the numbers array
     */
    public int[] getNumbersArray() {
      return numbers;
    }
  
    /*
     * Returns a String containing the values in the numbers array
     */
    public String getNumbers() {
      String result = "";
      
      // int index = 0;
  
      // while (index < numbers.length) {
      //   result += numbers[index] + " ";
      //   index++;
      // }
  
      for (int index = 0; index < numbers.length; index++) {
        result += numbers[index] + " ";
      }
      
      return result;
    }
    
  }