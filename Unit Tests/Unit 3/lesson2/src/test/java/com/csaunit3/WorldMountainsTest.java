package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("WorldMountains.java Test")
public class WorldMountainsTest {

    @Test
    @DisplayName("Return a String containing each mountain name and height => ")
    public void testPrintMountainHeights() {
        String[] mountains = {"Mount Everest", "K2", "Kangchenjunga", "Lhotse", "Makalu"};
        int[] heights = {29029, 28251, 28169, 27940, 27838};
        WorldMountains topFive = new WorldMountains(mountains, heights);

        String message = "WorldMountains printMountainHeights() does not return a String containing each mountain name and height on a new line.";
        message += "\n        Make sure the current values are being added to \"mountainString\" and that the loop is correct.";
        message += "\n       ";

        String expected = getExpectedString();
        String actual;
        
        try {
            actual = topFive.printMountainHeights();
        } catch (Exception e) {
            actual = "";
        }

        assertEquals(expected, actual, message);
    }

    private String getExpectedString() {
        return "Mount Everest height: 29029 feet\n" + 
            "K2 height: 28251 feet\n" + 
            "Kangchenjunga height: 28169 feet\n" + 
            "Lhotse height: 27940 feet\n" + 
            "Makalu height: 27838 feet\n";
    }

}