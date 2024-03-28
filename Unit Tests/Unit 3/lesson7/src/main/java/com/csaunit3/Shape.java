package com.csaunit3;

public class Shape {

    private double width;
  
    public Shape(double width) {
      this.width = width;
    }
  
    public double getWidth() {
      return width;
    }
  
    public void setWidth(double width) {
      this.width = width;
    }
  
    public double calculateArea() {
      return width * width;
    }
    
  }