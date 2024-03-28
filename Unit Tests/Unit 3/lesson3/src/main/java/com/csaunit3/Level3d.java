package com.csaunit3;

public class Level3d {
    public static void main(String[] args) {

        // TO DO #4: Instantiate a PainterPlus object.
        PainterPlus myPainterPlus = new PainterPlus(0, 13, "north", 50);

        // TO DO #5: Declare and initialize a 1D array.
        String[] paintColors = {"Aqua", "Ivory", "Pink"};

        // TO DO #6: Call the navigateTraffic() method.
        myPainterPlus.navigateTraffic(paintColors);

    }
}