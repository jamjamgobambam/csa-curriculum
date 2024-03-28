package com.csaunit4;

/*
 * Represents a video
 */
public class Video {

    private String title;  // The title of the video
  
    /*
     * Constructor to create a Video with
     * the specified title
     */
    public Video(String title) {
      this.title = title;
    }
  
    /*
     * Returns the title of the video
     */
    public String getTitle() {
      return title;
    }
  
    // TO DO #1: Write the equals() method.
  
    public boolean equals(Video other) {
      if (other == null) {
        return false;
      }
  
      return this.title.equals(other.getTitle());
    }
    
  }