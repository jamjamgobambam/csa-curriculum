package com.csaunit3;

/*
 * Stores and analyzes the list of artwork
 * and the years they were created
 */
public class Art {

    private String[] artworks;     // The list of artwork
    private int[] years;           // The list of years the artworks were created
  
    /*
     * Constructor to create a ArtStats object with
     * specified artworks and years they were created
     */
    public Art(String[] artworks, int[] years) {
      this.artworks = artworks;
      this.years = years;
    }

    public String[] getArtworks() {
      return artworks;
    }

    public int[] getYears() {
      return years;
    }
  
    /*
     * Checks if years array contains at
     * least one value that is equal to yearToFind
     */
    public boolean hasYear(int yearToFind) {
      // TO DO #1: Check if years array contains at least
      // one value that is equal to yearToFind.
  
      for (int index = 0; index < years.length; index++) {
        if (years[index] == yearToFind) {
          return true;
        }
      }
  
      return false;
    }
    
  }