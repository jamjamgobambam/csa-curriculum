package com.csaunit3;

public class Level3c {
    public static void main(String[] args) {
        
        String[] planetsList = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
        double[] dayLengthsList = {4222.6, 2802.0, 24, 24.7, 9.9, 10.7, 17.2, 16.1, 153.3};

        Planets myPlanets = new Planets(planetsList, dayLengthsList);

        System.out.println("A planet's length of day is less than 24 hours: " + myPlanets.hasDayLength(24));
        
    }
}