package com.csaunit4;

public class Level4b {
    public static void main(String[] args) {

        Video firstVideo = new Video("Adventures in Java Lab");
        Video secondVideo = new Video("Adventures in Java Lab");
    
        System.out.println("firstVideo == secondVideo: " + (firstVideo == secondVideo));
    
        // TO DO #2: Test your equals method and print the result.
    
        System.out.println("firstVideo == secondVideo: " + (firstVideo.equals(secondVideo)));
      }
}