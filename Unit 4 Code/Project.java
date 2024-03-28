/*
 * Represents a project on Kickstarter
 */
public class Project {

    private String name;       // The name of a project
    private int numBackers;    // The number of people who have backed a project
    private String category;   // The category of a project
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Declare and initialize a static variable called numProjects to 0.
     * -----------------------------------------------------------------------------
     */
  
    private static int numProjects = 0;
  
    /*
     * Sets name to the specified name, numBackers to the specified
     * number of backers, and category to the specified category
     */
    public Project(String name, int numBackers, String category) {
      this.name = name;
      this.numBackers = numBackers;
      this.category = category;
  
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Increment numProjects by 1.
       * -----------------------------------------------------------------------------
       */
  
      numProjects++;
    }
  
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write a static method called numProjects() that returns a String
     * containing the text "There are {numProjects} on Kickstarter!"
     * -----------------------------------------------------------------------------
     */
    
    public static String getNumProjects() {
      return "There are " + numProjects + " projects on Kickstarter!";
    }
  
    
  
    /*
     * Returns a String containing the information about the project
     */
    public String toString() {
      return name + "\nCategory: " + category + "\nBackers: " + numBackers;
    }
    
  }