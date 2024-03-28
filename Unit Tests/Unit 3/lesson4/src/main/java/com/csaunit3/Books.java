package com.csaunit3;

/*
 * Stores and analyzes the list of book
 * titles and their year of publication
 */
public class Books {

    private String[] titles;   // The list of book titles
    private int[] years;       // The list of years the books were published
  
    /*
     * Constructor to create a BooksStats object with
     * specified titles and years arrays
     */
    public Books(String[] titles, int[] years) {
      this.titles = titles;
      this.years = years;
    }

    public String[] getTitles() {
      return titles;
    }

    public int[] getYears() {
      return years;
    }
  
    /*
     * Checks if years array contains at least one value
     * that is equal to yearToFind
     */
    public boolean hasYear(int yearToFind) {
      // TO DO #1: Check if years array contains at least
      // one value that is equal to yearToFind.
  
      for (int index = 0; index < years.length; index++) {
        if (years[index] >= yearToFind) {
          return true;
        }
      }
  
      return false;
      
    }
  }