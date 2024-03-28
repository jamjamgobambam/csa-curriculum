public class StartupRunner {
    public static void main(String[] args) {
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Instantiate several Startup objects, then call the getNumStartups()
       * method and print the result.
       * -----------------------------------------------------------------------------
       */
  
      // Instantiates several Startup objects
      Startup touchup = new Startup("Touch Up Cup", "paint storage cup", true);
      Startup spark = new Startup("SparkCharge", "portable electric car charger", true);
      Startup garma = new Startup("GarmaGuard", "germ killing spray", false);
      Startup rumpl = new Startup("Rumpl", "high performance blankets", false);
  
      // Calls the getNumStartups() method and prints the results
      System.out.println(Startup.getNumStartups());
      
    }
  }