public class SolverRunner {
    public static void main(String[] args) {
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Instantiate several Solver objects, then call the getFastestTime()
       * method and print the result.
       * -----------------------------------------------------------------------------
       */
  
      // Instantiates several Solver objects
      Solver maxP = new Solver("Max Park", 363);
      Solver asher = new Solver("Asher Kim-Magierek", 389);
      Solver maxS = new Solver("Max Siauw", 403);
      Solver patrick = new Solver("Patrick Ponce", 424);
      Solver tanzer = new Solver("Tanzer Balimtas", 464);
  
      // Calls the getFastestTime() method and prints the result
      System.out.println(Solver.getFastestTime());
      
    }
  }