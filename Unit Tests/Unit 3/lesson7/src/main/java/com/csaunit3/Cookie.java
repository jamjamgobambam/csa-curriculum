package com.csaunit3;

/*
 * A Cookie that the Project Mercury Pastries Food Truck sells
 */
public class Cookie extends Dessert {

    private int diameter;     // The diameter of the Cookie
    private boolean isChewy;  // Whether or not the Cookie is chewy
  
    /*
     * Constructor to create a plain Cookie
     */
    public Cookie() {
      diameter = 0;
      isChewy = false;
    }
  
    /*
     * Constructor create a Cookie with specified
     * flavor, price, quantity, diameter, and chewy status
     */
    public Cookie(String newFlavor, double newPrice, int newQuantity, int newDiameter, boolean newChewy) {
      super(newFlavor, newPrice, newQuantity);
      diameter = newDiameter;
      isChewy = newChewy;
    }

    public int getDiameter() {
      return diameter;
    }

    public boolean getIsChewy() {
      return isChewy;
    }
  
    /*
     * Gets the total price of the dessert order
     */
    public double getTotalPrice() {
      double total = super.getTotalPrice();
  
      if (getQuantity() > 6) {
        total *= .75;
      }
  
      return total;
    }
    
  }