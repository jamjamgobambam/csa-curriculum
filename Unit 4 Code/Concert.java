/*
 * Represents a band's concert during a tour
 */
public class Concert {

    private String location;     // The location of a concert
    private int attendance;      // The number of people that attended a concert
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Declare and initialize a static variable called maxAttendance to 0.
     * -----------------------------------------------------------------------------
     */
  
    private static int maxAttendance = 0;  
  
    /*
     * Sets location to the specified location and
     * attendance to the specified attendance
     */
    public Concert(String location, int attendance) {
      this.location = location;
      this.attendance = attendance;
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Check if the parameter attendance is greater than maxAttendance. If this
       * is true, update the maxAttendance to the value passed to the parameter attendance.
       * -----------------------------------------------------------------------------
       */
  
      if (attendance > maxAttendance) {
        maxAttendance = attendance;
      }
      
    }
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write a static method called getMaxAttendance() that returns a String
     * containing the text "The max attendance at an event is {maxAttendance}", 
     * where maxAttendance is the largest attendance at an event.
     * -----------------------------------------------------------------------------
     */
  
    public static String getMaxAttendance() {
      return "The max attendance at an event is " + maxAttendance + "!";
    }
  
    
  
    /*
     * Returns a String containing information about the concert
     */
    public String toString() {
      return location + ": " + attendance + " people in attendance";
    }
    
  }