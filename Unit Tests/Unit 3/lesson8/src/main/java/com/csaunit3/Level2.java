package com.csaunit3;

public class Level2 {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("statenames.txt");

        String[] stateNames = myFileReader.getStringData(50);
        myFileReader.setFile("population.txt");
        int[] population = myFileReader.getIntData(50);

        States myStates = new States(stateNames, population);
        
        myStates.printPairs("population");

        // TO DO #3: Add the code to read and analyze the areas file.


        
    }
}