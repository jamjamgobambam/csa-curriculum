package com.csaunit3;

public class Level4a {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("nationalparks.txt");
        String[] parks = myFileReader.getStringData(62);

        NationalParks myParks = new NationalParks(parks);
        
        myParks.printParkNames();

        // TO DO #2: Call the reverse() method to reverse the array.
        myParks.reverse();

        // TO DO #3: Call the printParkNames() method to print the array.
        myParks.printParkNames();
        
    }
}