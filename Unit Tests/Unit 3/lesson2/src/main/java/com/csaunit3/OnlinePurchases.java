package com.csaunit3;

/*
 * Manages purchases made on an online store
 */
public class OnlinePurchases {

    private double[] purchases;
  
    /*
     * Creates an OnlinePurchases with an array of purchases
     */
    public OnlinePurchases(double[] purchases) {
      this.purchases = purchases;
    }
  
    /*
     * Returns the array of purchases
     */
    public double[] getPurchases() {
      return purchases;
    }
  
    /*
     * Returns the value in purchases at the specified index
     */
    public double getPurchase(int index) {
      // TO DO #1: Return the value in purchases at the specified index.
      return purchases[index];
    }
  
    /*
     * Changes the value in purchases at the specified index to the new value
     */
    public void setPurchase(int index, double newValue) {
      // TO DO #2: Change the value in purchases at the specified index to newValue;
      purchases[index] = newValue;
    }
    
  }