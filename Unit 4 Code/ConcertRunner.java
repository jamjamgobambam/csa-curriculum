public class ConcertRunner {
    public static void main(String[] args) {
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Instantiate several Concert objects, then call the getMaxAttendance()
       * method and print the result.
       * -----------------------------------------------------------------------------
       */
  
      // Instantiates several Concert objects
      Concert dallas = new Concert("Dallas", 58669);
      Concert glendale = new Concert("Glendale", 42849);
      Concert chicago = new Concert("Chicago", 107072);
      Concert philadelphia = new Concert("Philadelphia", 57415);
      Concert tampa = new Concert("Tampa", 55980);
  
      // Calls the getMaxAttendance() method and prints the result
      System.out.println(Concert.getMaxAttendance());
      
    }
  }