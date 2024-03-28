package com.csaunit3;

/*
 * Manages data for social media services
 */
public class SocialMedia {

    private int[] numFollowers;
  
    /*
     * Creates a SocialMediaAnalyzer by initializing the numFollowers array
     */
    public SocialMedia() {
      this.numFollowers = createNumFollowers();
    }

    public int[] getNumFollowers() {
      return numFollowers;
    }
  
    /*
     * Creates and returns an array containing the number of followers for each user
     */
    public int[] createNumFollowers() {
      // TO DO #1: Declare, initialize, and return an int array containing the values.
      int[] values = {15360340, 13716022, 189690, 53274, 4625};
      return values;
    }
  
    /*
     * Returns the number of users in the numFollowers array
     */
    public int getNumUsers() {
      // TO DO #2: Return the length of the numFollowers array.
      return numFollowers.length;
    }
    
  }