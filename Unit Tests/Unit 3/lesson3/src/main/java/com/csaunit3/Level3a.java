package com.csaunit3;

public class Level3a {
    public static void main(String[] args) {

        double[] dfwTemperatures = {72.13, 61.69, 59.58, 60.15, 66.41};
        TexasWeather dfw = new TexasWeather("Dallas-Fort Worth", dfwTemperatures);

        // TO DO #2: Call the getTemperatures() method and print the result.
        System.out.println(dfw.getTemperatures());
        
    }
}