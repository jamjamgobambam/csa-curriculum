package com.csaunit3;

/*
 * A Pie that the Project Mercury Pastries Food Truck sells
 */
public class Pie extends Dessert {

    private String filling;    // The filling flavor of the Pie
    private boolean hasCrust;  // Whether or not the Pie has a crust
  
    /*
     * Constructor to create a plain Pie
     */
    public Pie() {
      filling = "none";
      hasCrust = false;
    }
  
    /*
     * Constructor create a Pie with specified
     * flavor, price, quantity, filling flavor, and crust status
     */
    public Pie(String newFlavor, double newPrice, int newQuantity, String newFilling, boolean newCrust) {
      super(newFlavor, newPrice, newQuantity);
      filling = newFilling;
      hasCrust = newCrust;
    }

    public String getFilling() {
      return filling;
    }

    public boolean getHasCrust() {
      return hasCrust;
    }
  
    /*
     * Gets the total price of the dessert order
     */
    public double getTotalPrice() {
      double total = super.getTotalPrice();
  
      if (getQuantity() > 2) {
        total *= .8;
      }
  
      return total;
    }
  
  }