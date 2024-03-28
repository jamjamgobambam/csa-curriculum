package com.csaunit3;

/*
 * Processes cat breeds in a String array
 */
public class Cats {

    private String[] catBreeds;   // The 1D array of cat breeds
  
    /*
     * Constructor to create a Cats object with
     * a specified list of cat breeds
     */
    public Cats(String[] catBreeds) {
      this.catBreeds = catBreeds;
    }
  
    /*
     * Returns the catBreeds array
     */
    public String[] getCatBreeds() {
      return catBreeds;
    }
  
    /*
     * Prints the names of the parks in the catBreeds array
     */
    public void printCatBreeds() {
      for (String cat : catBreeds) {
        System.out.println(cat);
      }
    }
  
    /*
     * Reverses the catBreeds array
     */
    public void reverse() {
      // TO DO #1: Reverse the elements in the catBreeds array.
      int back = catBreeds.length - 1;
  
      for (int front = 0; front < catBreeds.length / 2; front++) {
        String temp = catBreeds[front];
        catBreeds[front] = catBreeds[back];
        catBreeds[back] = temp;
        back--;
      }
    }
    
  }