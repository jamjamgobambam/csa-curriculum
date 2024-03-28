package com.csaunit3;

public class Level4b {
    public static void main(String[] args) {

        // TO DO #3: Declare and initialize a 1D array.
        double[] purchases = {14.75, 12.98, 45.67, 32.50, 15.75};

        // TO DO #4: Instantiate an OnlinePurchases object with the array.
        OnlinePurchases customer = new OnlinePurchases(purchases);

        // TO DO #5: Call the getPurchase() to get the first purchase and print the result.
        double firstPurchase = customer.getPurchase(0);
        System.out.println("First Purchase: " + firstPurchase);

        // TO DO #6: Call the setPurchase() to change the third purchase.
        double thirdPurchase = customer.getPurchase(2);
        customer.setPurchase(2, thirdPurchase - 23.75);
        
    }
}