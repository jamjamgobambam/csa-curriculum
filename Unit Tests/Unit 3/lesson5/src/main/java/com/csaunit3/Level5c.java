package com.csaunit3;

public class Level5c {
    public static void main(String[] args) {
        
        double[] profitsList = {-10.80, -26.88, 17.60, 2.10, 68, 19.73, -11.99, 103.80, 6, 15.24, 236.23, 1.36, -1360};

        Profits techProfits = new Profits(profitsList);

        // TO DO #5: Print the result of a call to calculatePositiveSum() on the techProfits object.
        System.out.println("Total of Positive Profits: " + techProfits.calculatePositiveSum());
        
    }
}