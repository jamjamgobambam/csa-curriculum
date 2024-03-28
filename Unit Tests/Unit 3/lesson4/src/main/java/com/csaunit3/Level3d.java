package com.csaunit3;

public class Level3d {
    public static void main(String[] args) {
        
        String[] artworkList = {"Once Upon a Time", "Photo Booth", "Red Barn Door", "Our House", "The World"};
    
        int[] yearsList = {2008, 2008, 2008, 2007, 2006};

        Art myArt = new Art(artworkList, yearsList);

        System.out.println("Artwork has at least one created in 2007: " + myArt.hasYear(2007));

    }
}