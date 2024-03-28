package com.csaunit3;

public class Level4b {
    public static void main(String[] args) {
        
        /*
        * Pollution indexes for Amsterdam, Sydney, Vienna, Stockholm, Copenhagen,
        * Helsinki, Berlin, Barcelona, Vancouver, Melbourne (in order).
        */
        double[] pollutionIndexes = {30.93, 26.86, 17.33, 19.63, 21.24, 13.08, 39.41, 65.19, 24.26, 25.9};

        Pollution cityIndexes = new Pollution(pollutionIndexes);

        // TO DO #3: Print the result of a call to countUnderMax().
        System.out.print("Number of cities with pollution indexes less than " + Pollution.MAX_POLLUTION + ": ");
        System.out.println(cityIndexes.countUnderMax());
        
    }
}