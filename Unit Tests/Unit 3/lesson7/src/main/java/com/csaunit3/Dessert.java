package com.csaunit3;

/*
 * A Dessert that the Project Mercury Pastries Food Truck sells
 */
public class Dessert {

    private String flavor;  // The flavor of the dessert
    private double price;   // The price of the dessert
    private int quantity;   // The quantity of desserts ordered
  
    /*
     * Constructor to create a plain Dessert
     */
    public Dessert() {
      flavor = "plain";
      price = 0.00;
      quantity = 0;
    }
  
    /*
     * Constructor create a Dessert with
     * specified flavor, price, and quantity
     */
    public Dessert(String newFlavor, double newPrice, int newQuantity) {
      flavor = newFlavor;
      price = newPrice;
      quantity = newQuantity;
    }
  
    /*
     * Gets the flavor of the dessert
     */
    public String getFlavor() {
      return flavor;
    }
  
    /*
     * Gets the quantity of desserts ordered
     */
    public int getQuantity() {
      return quantity;
    }
  
    /*
     * Gets the total price of the dessert order
     */
    public double getTotalPrice() {
      return price * quantity;
    }
  
    public String getDessertsInfo(Dessert[] dessertList) {
      String result = "";
      
      for (Dessert dessert : dessertList) {
        result += dessert.getFlavor() + ": " + dessert.getTotalPrice() + "\n";
      }
  
      return result;
    }
    
  }