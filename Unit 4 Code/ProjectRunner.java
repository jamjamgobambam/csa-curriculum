public class ProjectRunner {
    public static void main(String[] args) {
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Instantiate several Project objects, then call the getNumProjects()
       * method and print the result.
       * -----------------------------------------------------------------------------
       */
  
      // Instantiates Project objects
      Project pebble = new Project("Pebble Time", 78471, "Product Design");
      Project ankermake = new Project("AnkerMake M5 3d Printer", 11313, "3D Printing");
      Project backpack = new Project("The Everyday Backpack", 26359, "Product Design");
      Project marvel = new Project("Marvel United: X-Men", 25404, "Tabletop Games");
  
      // Calls the getNumProjects() method and prints the result
      System.out.println(Project.getNumProjects());
      
    }
  }