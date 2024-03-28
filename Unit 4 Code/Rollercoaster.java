/*
 * Represents a roller coaster
 */
public class Rollercoaster {

    private String name;
    private int speed;
  
    /*
     * Sets name to the specified name and speed to
     * the specified speed to the roller coaster
     */
    public Rollercoaster(String name, int speed) {
      this.name = name;
      this.speed = speed;
    }
  
    /*
     * Returns the speed of the roller coaster
     */
    public int getSpeed() {
      return speed;
    }
  
    /*
     * Returns a String containing information about the roller coaster
     */
    public String toString() {
      return name + ": " + speed + " mph";
    }
    
  }