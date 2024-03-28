package com.csaunit3;

public class Level4c {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("gametitles.txt");
        String[] games = myFileReader.getStringData(51);

        VideoGames myVideoGames = new VideoGames(games);
        
        myVideoGames.printGameTitles();

        // TO DO #2: Call the reverse() method to reverse the array.
        myVideoGames.reverse();

        // TO DO #3: Call the printGameTitles() method to print the array.
        myVideoGames.printGameTitles();
        
    }
}