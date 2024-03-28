package com.csaunit4;

/*
 * Analyzes population growth
 */
public class PopulationData {

    private double currentPopulation;  // The current population
  
    /*
     * Constructor to create a PopulationData object
     * with the specified current population
     */
    public PopulationData(double currentPopulation) {
      this.currentPopulation = currentPopulation;
    }
  
    /*
     * Returns the current population
     */
    public double getCurrentPopulation() {
      return currentPopulation;
    }
  
    /*
     * Returns the new population
     */
    public double calculateGrowth(double growthRate, double time) {
      // TO DO #1: Calculate and return the total population.
  
      return currentPopulation * Math.pow(2.7, (growthRate * time));
      
    }
    
  }