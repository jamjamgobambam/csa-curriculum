package com.csaunit3;

/*
 * Represents the weather in Texas
 */
public class TexasWeather {

    private String city;              // the name of the city
    private double[] temperatures;    // array containing the average temperatures
  
    /*
     * Constructor to create a TexasWeather object with a
     * specified city name and array of temperatures
     */
    public TexasWeather(String city, double[] temperatures) {
      this.city = city;
      this.temperatures = temperatures;
    }
  
    /*
     * Returns the name of the city
     */
    public String getCity() {
      return city;
    }
  
    /*
     * Returns the temperatures array
     */
    public double[] getAllTemperatures() {
      return temperatures;
    }
  
    /*
     * Returns a String containing each value in the temperatures array
     */
    public String getTemperatures() {
      String result = "";
  
      // TO DO #1: Write a for loop to traverse the temperatures
      // array to create a String containing each value.
      for (int index = 0; index < temperatures.length; index++) {
        result += temperatures[index] + " ";
      }
  
      return result;
    }
    
  }