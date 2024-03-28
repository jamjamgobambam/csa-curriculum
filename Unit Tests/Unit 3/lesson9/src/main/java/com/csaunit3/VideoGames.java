package com.csaunit3;

/*
 * Processes video game titles in a String array
 */
public class VideoGames {

    private String[] gameTitles;   // The 1D array of video game titles
  
    /*
     * Constructor to create a VideoGames object with
     * a specified list of video game titles
     */
    public VideoGames(String[] gameTitles) {
      this.gameTitles = gameTitles;
    }
  
    /*
     * Returns the gameTitles array
     */
    public String[] getGameTitles() {
      return gameTitles;
    }
  
    /*
     * Prints the names of the video games in the gameTitles array
     */
    public void printGameTitles() {
      for (String videoGame : gameTitles) {
        System.out.println(videoGame);
      }
    }
  
    /*
     * Reverses the gameTitles array
     */
    public void reverse() {
      // TO DO #1: Reverse the elements in the gameTitles array.
      int back = gameTitles.length - 1;
  
      for (int front = 0; front < gameTitles.length / 2; front++) {
        String temp = gameTitles[front];
        gameTitles[front] = gameTitles[back];
        gameTitles[back] = temp;
        back--;
      }
    }
    
  }