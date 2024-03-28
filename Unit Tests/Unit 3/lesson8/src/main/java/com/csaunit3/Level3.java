package com.csaunit3;

public class Level3 {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("statenames.txt");

        String[] stateNames = myFileReader.getStringData(50);
        myFileReader.setFile("population.txt");
        int[] population = myFileReader.getIntData(50);

        States2 myStates = new States2(stateNames, population);
        
        // TO DO #3: Print the result of a call to getMax().
        System.out.println("Largest population: " + myStates.getMax());

        // TO DO #4: Print the result of a call to getMin().
        System.out.println("Smallest population: " + myStates.getMin());
        
    }
}