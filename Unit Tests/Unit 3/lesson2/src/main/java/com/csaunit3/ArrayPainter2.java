package com.csaunit3;

/*
 * Represents a Painter that has an array of paint colors
 */
public class ArrayPainter2 extends Painter {

  private String[] paintColors;

  public ArrayPainter2(int x, int y, String direction, int paint, String[] paintColors) {
    super(x, y, direction, paint);
    this.paintColors = paintColors;
  }

  /*
   * Moves and paints using the color at the specified index in paintColors
   */
  public void moveAndPaint(int index) {
    // TO DO #1: Move and paint using the color at index in paintColors.
    move();
    paint(paintColors[index]);
    
  }

  /*
   * Changes a color in paintColors to a new color
   */
  public void setColor(int index, String newColor) {
    // TO DO #2: Change the color in paintColors at index to the newColor.
    paintColors[index] = newColor;
    
  }
  
}