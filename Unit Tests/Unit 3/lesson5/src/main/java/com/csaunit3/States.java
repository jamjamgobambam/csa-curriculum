package com.csaunit3;

/*
 * Stores and analyzes the list of states
 */
public class States {

    private String[] names;   // The list of states
  
    /*
     * Constructor to create a StatesStats object with
     * specified states list
     */
    public States(String[] names) {
      this.names = names;
    }
  
    /*
     * Returns a String containing each state
     */
    public String getStates() {
      // TO DO #1: Refactor the loop to use an enhanced for loop.
      String result = "";
  
      for (String state : names) {
        result += state + " ";
      }
  
      return result;
    }
    
  }