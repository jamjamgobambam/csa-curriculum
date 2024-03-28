/*
 * Represents a person that participated in
 * the World Cube Association competition
 */
public class Solver {

    private String name;    // The name of a person
    private int time;       // The time in centiseconds it took a person to solve a Rubik's Cube
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Declare and initialize a static variable called fastestTime to 0.
     * -----------------------------------------------------------------------------
     */
  
    private static int fastestTime = 0;  
  
    /*
     * Sets name to the specified name and time
     * to the specified time in centiseconds
     */
    public Solver(String name, int time) {
      this.name = name;
      this.time = time;
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Check if the parameter time is greater than fastestTime. If this is true,
       * update fastestTime to the value passed to the parameter time.
       * -----------------------------------------------------------------------------
       */
  
      if (time > fastestTime) {
        fastestTime = time;
      }
      
    }
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write a static method called getFastestTime() that returns a String
     * containing the text "The fastest time so far is {fastestTime}", where
     * fastestTime is the fastest time of all Solver objects.
     * -----------------------------------------------------------------------------
     */
  
    public static String getFastestTime() {
      return "The fastest time so far is " + fastestTime;
    }
  
    
  
    /*
     * Returns a String containing information about the solver
     */
    public String toString() {
      return name + ": " + time + " centiseconds";
    }
    
  }