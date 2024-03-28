package com.csaunit3;

public class Level4a {
    public static void main(String[] args) {
        
        /*
        * Rollercoaster speeds for Adventure Express, American Eagle, Backlot Stunt Coaster,
        * Batman The Ride, Beast, Blue Streak, Boardwalk Bullet, Boomerang, California Screamin',
        * and Cedar Creek Mine Ride (in order).
        */
        int[] speeds = {35, 66, 40, 50, 64, 40, 51, 47, 55, 42};

        Rollercoasters rollercoasters = new Rollercoasters(speeds);

        // TO DO #3: Print the result of a call to countUnderMax().
        System.out.print("Number of rollercoasters under " + Rollercoasters.MAX_SPEED + ": ");
        System.out.println(rollercoasters.countUnderMax());
        
    }
}