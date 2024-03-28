package com.csaunit3;

public class Level5 {
    public static void main(String[] args) {

        String[] mountains = {"Mount Everest", "K2", "Kangchenjunga", "Lhotse", "Makalu"};
        int[] heights = {29029, 28251, 28169, 27940, 27838};

        WorldMountains myMountains = new WorldMountains(mountains, heights);

        // TO DO #2: Call the printMountainHeights() method and print the result.
        String mountainsInfo = myMountains.printMountainHeights();
        System.out.println(mountainsInfo);
        
    }
}