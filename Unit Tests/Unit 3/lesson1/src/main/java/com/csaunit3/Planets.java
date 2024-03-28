package com.csaunit3;

/*
 * Manages data about the planets in the solar system
 */
public class Planets {

    private String[] planetNames;
    private double[] distances;
  
    /*
     * Creates a PlanetsManager by initializing the planets and distances arrays
     */
    public Planets() {
      this.planetNames = createPlanetNames();
      this.distances = createDistances();
    }

    public String[] getPlanetNames() {
      return planetNames;
    }

    public double[] getDistances() {
      return distances;
    }
  
    /*
     * Creates and returns an array containing the names of planets
     */
    public String[] createPlanetNames() {
      // TO DO #1: Declare, initialize, and return a String array containing the values.
      String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
      return planets;
    }
  
    /*
     * Creates and returns an array containing the distances
     */
    public double[] createDistances() {
      // TO DO #2: Declare, initialize, and return a double array containing the values.
      double[] values = {57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1, 5906.4};
      return values;
    }
  
    /*
     * Returns the number of planets in the planetNames array
     */
    public int getNumPlanets() {
      // TO DO #3: Return the length of the planetNames array.
      return planetNames.length;
    }
  
    /*
     * Returns the number of values in the distances array
     */
    public int getNumDistances() {
      // TO DO #4: Return the length of the distances array.
      return distances.length;
    }
    
  }