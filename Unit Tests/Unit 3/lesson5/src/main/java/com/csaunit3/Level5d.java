package com.csaunit3;

public class Level5d {
    public static void main(String[] args) {
        
        double[] meltingList = {-434.81, -458, 356.9, 2349, 3767, 6422, -346, -361.82, -363.32, -415.46};

        Elements firstTenElements = new Elements(meltingList);

        // TO DO #5: Print the result of a call to calculatePositiveAverage() on the firstTenElements object.
        System.out.println("Average Melting Points: " + firstTenElements.calculatePositiveAverage());
        
    }
}