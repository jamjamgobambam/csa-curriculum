package com.csaunit3;

/*
 * Processes languages in a String array
 */
public class Languages {

    private String[] mostSpoken;   // The 1D array of park names
  
    /*
     * Constructor to create a Languages object with
     * a specified list of most spoken languages
     */
    public Languages(String[] mostSpoken) {
      this.mostSpoken = mostSpoken;
    }
  
    /*
     * Returns the mostSpoken array
     */
    public String[] getMostSpoken() {
      return mostSpoken;
    }
  
    /*
     * Prints the languages in the mostSpoken array
     */
    public void printLanguages() {
      for (String language : mostSpoken) {
        System.out.println(language);
      }
    }
  
    /*
     * Reverses the mostSpoken array
     */
    public void reverse() {
      // TO DO #1: Reverse the elements in the mostSpoken array.
      int back = mostSpoken.length - 1;
  
      for (int front = 0; front < mostSpoken.length / 2; front++) {
        String temp = mostSpoken[front];
        mostSpoken[front] = mostSpoken[back];
        mostSpoken[back] = temp;
        back--;
      }
    }
    
  }