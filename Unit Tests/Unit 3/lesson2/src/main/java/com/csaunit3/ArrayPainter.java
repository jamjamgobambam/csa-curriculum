package com.csaunit3;

/*
 * Represents a Painter that has an array of paint colors
 */
public class ArrayPainter extends Painter {

  private String[] paintColors;

  public ArrayPainter(int x, int y, String direction, int paint, String[] paintColors) {
    super(x, y, direction, paint);
    this.paintColors = paintColors;
  }

  public String[] getPaintColors() {
    return paintColors;
  }

  /*
   * Moves and paints using the colors given in paintColors
   */
  public void moveAndPaint() {
    // TO DO #1: Move and paint using each color in paintColors.
    int index = 0;

    while (index < paintColors.length) {
      move();
      paint(paintColors[index]);
      index++;
    }
    
  }

  /*
   * Changes a color in paintColors to a new color
   */
  public void setColor(int index, String newColor) {
    // TO DO #2: Change the color in paintColors at index to the newColor.
    paintColors[index] = newColor;
    
  }
  
}