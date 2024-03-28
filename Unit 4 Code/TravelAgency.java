/*
 * Manages data about roller coasters
 */
public class TravelAgency {

    private Rollercoaster[] rollercoasters;    // The 1D array of rollercoasters
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Declare and initialize a constant called CHILD_MAX_SPEED to 35.
     * -----------------------------------------------------------------------------
     */
  
    
  
    /*
     * Initializes rollercoasters to the specified 1D array of rollercoasters
     */
    public TravelAgency(Rollercoaster[] rollercoasters) {
      this.rollercoasters = rollercoasters;
    }
  
    /*
     * Returns a String containing rollercoasters that are
     * considered child-friendly (under 35 mph)
     */
    public String getChildFriendly() {
      String result = "Child-Friendly Roller Coasters\n---------------\n";
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Update the condition to use the constant.
       * -----------------------------------------------------------------------------
       */
  
      for (Rollercoaster coaster : rollercoasters) {
        if (coaster.getSpeed() <= 35) {
          result += coaster + "\n";
        }
      }
  
      return result;
    }
    
  }