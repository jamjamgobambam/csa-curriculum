package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Shape Superclass Test")
public class ShapeTest {
    
    Shape myShape;
    String message;

    @Test
    @Order(1)
    @DisplayName("Return the area of a Shape object => ")
    public void testShapeCalculateArea() {
        message = "Shape calculateArea() does not return area of a Shape object.";
        message += "\n        The area of a Shape object should be the width multiplied by the width.";
        message += "\n       ";

        myShape = new Shape(4);
        double actual = myShape.calculateArea();

        assertEquals(16, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the area of a Rectangle object => ")
    public void testRectangleCalculateArea() {
        message = "Rectangle calculateArea() does not return area of a Rectangle object.";
        message += "\n        The area of a Rectangle object should be the width multiplied by the height.";
        message += "\n       ";

        myShape = new Rectangle(3, 6);
        double actual = myShape.calculateArea();

        assertEquals(18, actual, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return the area of a Circle object => ")
    public void testCircleCalculateArea() {
        message = "Circle calculateArea() does not return area of a Circle object.";
        message += "\n        The area of a Circle object should be 3.14 multiplied by the radius times the radius.";
        message += "\n       ";

        myShape = new Circle(3);
        double actual = myShape.calculateArea();

        assertEquals(7.065, actual, message);
    }

}