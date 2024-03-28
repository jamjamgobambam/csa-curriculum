package com.csaunit3;

public class Level3d {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("countries.txt");
        String[] countries = myFileReader.getStringData(65);

        myFileReader.setFile("fees.txt");
        double[] fees = myFileReader.getDoubleData(65);

        NetflixStats myNetflixStats = new NetflixStats(countries, fees);

        // TO DO #2: Print the result of a call to hasDuplicates().
        System.out.println("Duplicate subscription fees in different countries: " + myNetflixStats.hasDuplicates());
        
    }
}