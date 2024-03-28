package com.csaunit4;

public class Level5c {
    public static void main(String[] args) {

        PopulationData myPopulation = new PopulationData(250.3);
    
        // TO DO #2: Call the calculateGrowth() method.
        double newPopulation = myPopulation.calculateGrowth(2, 5);
    
        // TO DO #3: Print the current and new population.
        System.out.println("Current population: " + myPopulation.getCurrentPopulation());
        System.out.println("Population in 5 years: " + newPopulation);
        
      }
}