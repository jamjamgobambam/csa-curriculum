package com.csaunit3;

public class Level2 {
    public static void main(String[] args) {
        
        Shape myShape = new Shape(4);
        Rectangle myRectangle = new Rectangle(3, 6);
        Circle myCircle = new Circle(3);

        Shape[] shapesList = {myShape, myRectangle, myCircle};

        for (Shape theShape : shapesList) {
            System.out.println(theShape.calculateArea());
        }
        
    }
}