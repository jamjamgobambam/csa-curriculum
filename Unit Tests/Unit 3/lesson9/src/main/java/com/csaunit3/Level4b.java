package com.csaunit3;

public class Level4b {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("languages.txt");
        String[] languages = myFileReader.getStringData(91);

        Languages mostSpokenLanguages = new Languages(languages);
        
        mostSpokenLanguages.printLanguages();

        // TO DO #2: Call the reverse() method to reverse the array.
        mostSpokenLanguages.reverse();

        // TO DO #3: Call the printLanguages() method to print the array.
        mostSpokenLanguages.printLanguages();
        
    }
}