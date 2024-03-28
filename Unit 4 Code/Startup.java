/*
 * Represents a startup business that appeared on Shark Tank
 */
public class Startup {

    private String name;          // The name of a startup company
    private String description;   // A description of a company's product
    private boolean gotDeal;      // Whether or not a startup company got the deal
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Declare and initialize a static variable called numStartups to 0.
     * -----------------------------------------------------------------------------
     */
  
    private static int numStartups = 0;
  
    /*
     * Sets name to the specified name, description to the specified
     * description, and gotDeal to the specified status
     */
    public Startup(String name, String description, boolean gotDeal) {
      this.name = name;
      this.description = description;
      this.gotDeal = gotDeal;
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Increment numStartups by 1.
       * -----------------------------------------------------------------------------
       */
  
      numStartups++;
    }
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write a static method called getNumStartups() that returns a String containing
     * the text "There have been {numStartups} startup pitches on Shark Tank!", where
     * numStartups is the number of Startup objects that have been instantiated.
     * -----------------------------------------------------------------------------
     */
  
    public static String getNumStartups() {
      return "There have been " + numStartups + " startup pitches on Shark Tank!";
    }
  
    
  
    /*
     * Returns a String containing information about the startup
     */
    public String toString() {
      String result = name + " - " + description + "\n";
  
      if (gotDeal) {
        result += "Got the deal!";
      }
      else {
        result += "No deal :(";
      }
  
      return result;
    }
    
  }