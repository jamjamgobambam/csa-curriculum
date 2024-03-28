package com.csaunit3;

public class Rectangle extends Shape {

    private double height;
  
    public Rectangle(double width, double height) {
      super(width);
      this.height = height;
    }
  
    public double getHeight() {
      return height;
    }
  
    public void setHeight(double height) {
      this.height = height;
    }
  
    public double calculateArea() {
      return getWidth() * height;
    }
    
  }