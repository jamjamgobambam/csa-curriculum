package com.csaunit3;

/*
 * Represents a Customer at the Project
 * Mercury Pastries Food Truck
 */
public class Customer {

    private String name;    // The name of the customer
    private int quantity;   // The number of desserts the customer ordered
  
    // TO DO #1: Declare and initialize a static variable called newCustomers.
    public static int newCustomers = 0;
  
    /*
     * Constructor to create a Customer object with
     * a specified name and quantity
     */
    public Customer(String name, int quantity) {
      this.name = name;
      this.quantity = quantity;
  
      // TO DO #2: Increase the value of newCustomers by 1.
      newCustomers++;
      
    }

    public String getName() {
      return name;
    }

    public int getQuantity() {
      return quantity;
    }
  
  }