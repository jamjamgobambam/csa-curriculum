package com.csaunit4;

/*
 * Analyzes city data
 */
public class CityData {

    private double[] landAreas;   // The list of land areas
  
    /*
     * Constructor to create a CityData object
     * with the specified array of land areas
     */
    public CityData(double[] landAreas) {
      this.landAreas = landAreas;
    }
  
    /*
     * Returns an array containing the approximate
     * width of each city
     */
    public double[] calculateSizes() {
      // TO DO #2: Return an array containing the approximate width of each city.
  
      double[] cityWidths = new double[landAreas.length];
      
      for (int index = 0; index < landAreas.length; index++) {
        double radius = Math.sqrt(landAreas[index] / Math.PI);
        double width = radius * 2;
        cityWidths[index] = width;
      }
  
      return cityWidths;
    }
    
  }