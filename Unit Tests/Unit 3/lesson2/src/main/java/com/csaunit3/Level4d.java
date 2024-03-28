package com.csaunit3;

public class Level4d {
    public static void main(String[] args) {

        // TO DO #3: Declare and initialize a 1D array of paint colors.
        String[] paintColors = {"Coral", "DarkTurquoise", "DeepPink", "LavenderBlush", "LightSteelBlue"};

        // TO DO #4: Instantiate an ArrayPainter object with the array of paint colors.
        ArrayPainter2 myPainter = new ArrayPainter2(3, 3, "east", 10, paintColors);

        // TO DO #5: Call the moveAndPaint() method to move and paint.
        myPainter.moveAndPaint(0);
        myPainter.moveAndPaint(1);
        myPainter.moveAndPaint(2);
        myPainter.moveAndPaint(3);
        myPainter.moveAndPaint(4);

        // TO DO #6: Call the setColor() method to change or or more colors in the array to a new color.
        myPainter.setColor(1, "BlueViolet");

        // TO DO #7: Call the moveAndPaint() method to move and paint using the new colors.
        myPainter.turnLeft();
        myPainter.move();
        myPainter.turnLeft();
        myPainter.moveAndPaint(0);
        myPainter.moveAndPaint(1);
        myPainter.moveAndPaint(2);
        myPainter.moveAndPaint(3);
        myPainter.moveAndPaint(4);

    }
}