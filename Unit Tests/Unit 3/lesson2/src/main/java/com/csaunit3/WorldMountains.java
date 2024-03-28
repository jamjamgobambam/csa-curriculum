package com.csaunit3;

/*
 * Manages data about mountains
 */
public class WorldMountains {

    private String[] names;
    private int[] heights;
  
    /*
     * Creates a WorldMountains with a
     * names array and a heights array
     */
    public WorldMountains(String[] names, int[] heights) {
      this.names = names;
      this.heights = heights;
    }
  
    /*
     * Returns the array containing the mountain names
     */
    public String[] getNames() {
      return names;
    }
  
    /*
     * Returns the array containing the mountain heights
     */
    public int[] getHeights() {
      return heights;
    }
  
    /*
     * Returns a String containing the mountain names and their heights
     */
    public String printMountainHeights() {
      String mountainString = "";
      
      // TO DO #1: Traverse the names and heights array to create
      // a String containing each mountain name and height on a new line.
      int index = 0;
  
      while (index < names.length) {
        mountainString += names[index] + " height: " + heights[index] + " feet\n";
        index++;
      }
  
      return mountainString;
    }
    
  }