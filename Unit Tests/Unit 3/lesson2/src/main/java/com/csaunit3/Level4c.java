package com.csaunit3;

public class Level4c {
    public static void main(String[] args) {

        // TO DO #3: Declare and initialize a 1D array of paint colors.
        String[] paintColors = {"Coral", "DarkTurquoise", "DeepPink", "LavenderBlush", "LightSteelBlue"};

        // TO DO #4: Instantiate an ArrayPainter object with the array of paint colors.
        ArrayPainter myPainter = new ArrayPainter(5, 0, "south", 18, paintColors);

        // TO DO #5: Call the moveAndPaint() method to move and paint.
        myPainter.moveAndPaint();

        // TO DO #6: Call the setColor() method to change or or more colors in the array to a new color.
        myPainter.setColor(1, "BlueViolet");

        // TO DO #7: Call the moveAndPaint() method to move and paint using the new colors.
        myPainter.turnLeft();
        myPainter.move();
        myPainter.turnLeft();
        myPainter.moveAndPaint();
        
    }
}