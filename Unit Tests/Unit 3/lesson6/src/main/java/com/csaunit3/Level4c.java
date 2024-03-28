package com.csaunit3;

public class Level4c {
    public static void main(String[] args) {
        
        /*
        * Prices of a standard Netflix subscription in Canada, Costa Rica,
        * France, Germany, India, Japan, New Zealand, Peru, United Kingdom,
        * and United States (in order).
        */
        double[] pricesList = {11.87, 12.99, 15.24, 14.67, 6.61, 13.13, 12.53, 8.56, 13.2, 13.99};

        Netflix countryPrices = new Netflix(pricesList);

        // TO DO #3: Print the result of a call to countUnderMax().
        System.out.print("Number of countries with prices less than " + Netflix.MAX_PRICE + ": ");
        System.out.println(countryPrices.countUnderMax());
        
    }
}