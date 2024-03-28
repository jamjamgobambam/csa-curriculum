package com.csaunit3;

/*
 * Analyzes data about Netflix subscription fees in different countries
 */
public class NetflixStats {

    private String[] countries;
    private double[] subscriptionFees;
  
    /*
     * Constructor to create an NetflixStats object with the
     * specified arrays of countries and their subscription fees
     */
    public NetflixStats(String[] countries, double[] subscriptionFees) {
      this.countries = countries;
      this.subscriptionFees = subscriptionFees;
    }
  
    /*
     * Returns true if there are duplicate years in
     * the subscriptionFees array, otherwise returns false
     */
    public boolean hasDuplicates() {
      // TO DO #1: Traverse the subscriptionFees array to determine if there
      // are duplicate values and return the result.
      boolean status = false;
      
      for (int start = 0; start < subscriptionFees.length; start++) {
        for (int next = start + 1; next < subscriptionFees.length; next++) {
          if (subscriptionFees[start] == subscriptionFees[next]) {
            status = true;
          }
        }
      }
  
      return status;
    }
    
  }