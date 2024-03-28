package com.csaunit3;

public class Level3b {
    public static void main(String[] args) {
        
        PainterPlus firstPainter = new PainterPlus(0, 5, "south", 10);
        PainterPlus secondPainter = new PainterPlus(4, 7, "east", 10);

        firstPainter.move();
        secondPainter.move();

        // TO DO #4: Print the value of totalPainters.
        System.out.println("Total Painters: " + PainterPlus.totalPainters);

        // TO DO #5: Create more PainterPlus objects, then print
        // the new value of totalPainters.
        PainterPlus thirdPainter = new PainterPlus(10, 10, "north", 10);
        PainterPlus fourthPainter = new PainterPlus(6, 3, "west", 10);

        thirdPainter.move();
        fourthPainter.move();

        System.out.println("Total Painters: " + PainterPlus.totalPainters);
        
    }
}