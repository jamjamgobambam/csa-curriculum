package com.csaunit3;

public class Level4d {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("catbreeds.txt");
        String[] breeds = myFileReader.getStringData(67);

        Cats myCats = new Cats(breeds);
        
        myCats.printCatBreeds();

        // TO DO #2: Call the reverse() method to reverse the array.
        myCats.reverse();

        // TO DO #3: Call the printCatBreeds() method to print the array.
        myCats.printCatBreeds();
        
    }
}