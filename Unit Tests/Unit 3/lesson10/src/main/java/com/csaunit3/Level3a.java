package com.csaunit3;

public class Level3a {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("airlinenames.txt");
        String[] airlines = myFileReader.getStringData(134);

        myFileReader.setFile("yearsfounded.txt");
        int[] years = myFileReader.getIntData(134);

        AirlineStats myAirlines = new AirlineStats(airlines, years);

        // TO DO #2: Print the result of a call to hasDuplicates().
        System.out.println("Duplicate years that airlines were founded: " + myAirlines.hasDuplicates());
        
    }
}