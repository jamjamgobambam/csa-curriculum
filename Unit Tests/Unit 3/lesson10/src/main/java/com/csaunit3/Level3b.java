package com.csaunit3;

public class Level3b {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("teamnames.txt");
        String[] teams = myFileReader.getStringData(30);

        myFileReader.setFile("championshipwins.txt");
        int[] wins = myFileReader.getIntData(30);

        BasketballStats myBasketballStats = new BasketballStats(teams, wins);

        // TO DO #2: Print the result of a call to hasDuplicates().
        System.out.println("Duplicate number of championship wins: " + myBasketballStats.hasDuplicates());
        
    }
}