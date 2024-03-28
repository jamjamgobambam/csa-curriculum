package com.csaunit3;

/*
 * Represents a sandwich
 */
public class Sandwich {

    private String type;                      // The type of sandwich
  
    public static final double PRICE = 2.75;  // The price for all sandwiches
  
    /*
     * Constructor to create a Sandwich object
     * with a specified type
     */
    public Sandwich(String type) {
      this.type = type;
    }

    public String getType() {
      return type;
    }
    
  }