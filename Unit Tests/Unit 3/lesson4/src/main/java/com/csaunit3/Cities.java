package com.csaunit3;

/*
 * Stores and analyzes the annual hours
 * worked by residents in cities
 */
public class Cities {

    private String[] cityNames;           // The list of cities
    private int[] annualHoursWorked;   // The list of hours worked in each city
  
    /*
     * Constructor to create a LivingStats object with the
     * specified arrays of cities and annualHoursWorked
     */
    public Cities(String[] cityNames, int[] annualHoursWorked) {
      this.cityNames = cityNames;
      this.annualHoursWorked = annualHoursWorked;
    }
  
    /* 
     * Checks if all annual hours worked are greater
     * than or equal to the specified hours
     */
    public boolean hasAtLeast(int hours) {
      for (int index = 0; index < annualHoursWorked.length; index++) {
        if (annualHoursWorked[index] >= hours) {
          return true;
        }
      }
  
      return false;
    }
  
    /* 
     * Finds which city has a specific number of hours worked
     * and returns a String with the city name and hours worked
     */
    public String cityWithValue(int hours) {
      for (int index = 0; index < annualHoursWorked.length; index++) {
        if (annualHoursWorked[index] == hours) {
          return cityNames[index] + " - Average Annual Hours Worked: " + annualHoursWorked[index];
        }
      }
  
      return "None found.";
    }
  }