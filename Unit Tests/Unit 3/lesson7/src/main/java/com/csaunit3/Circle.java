package com.csaunit3;

public class Circle extends Shape {

    public Circle(double width) {
      super(width);
    }
  
    public double calculateArea() {
      double radius = getWidth() / 2;
      return 3.14 * (radius * radius);
    }
    
  }