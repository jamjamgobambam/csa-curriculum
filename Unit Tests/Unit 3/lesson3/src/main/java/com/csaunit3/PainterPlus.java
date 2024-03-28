package com.csaunit3;

/*
 * Creates a PainterPlus
 * PainterPlus is a subclass of Painter.
 */
public class PainterPlus extends Painter {

  /*
   * Constructor to create a PainterPlus object
   */
  public PainterPlus() {
    super();  // Calls the Painter constructor
  }

  /*
   * Unit 2 Lesson 4
   * Constructor to create a PainterPlus object
   */
  public PainterPlus(int x, int y, String direction, int paint) {
    super(x, y, direction, paint);  // Calls the Painter constructor
  }

  /*
   * Turns a PainterPlus object to the right
   * by turning left three times
   */
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /*
   * Unit 1 Lesson 9
   */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  /*
   * Unit 1 Lesson 9
   */
  public void paintLine(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
  }

  /*
   * Unit 1 Lesson 10
   */
  public void moveOrTakePaint() {
    while (canMove()) {
      if (!isOnBucket()) {
        move();
      }
      else {
        takeAllPaint();
      }
    }
  }

  /*
   * Unit 1 Lesson 10
   */
  public void moveSouth() {
    while (canMove("south")) {
      if (!isFacingSouth()) {
        turnRight();
      }
      else {
        move();
      }
    }
  }

  /*
   * Unit 1 Lesson 11
   */
  public void printStatus() {
    System.out.println("Paint: " + getMyPaint());
    System.out.println("X Location: " + getX());
    System.out.println("Y Location: " + getY());
    System.out.println("Direction: " + getDirection());
  }

  /*
   * Unit 1 Lesson 12 - Choice A & B
   */
  public void moveFast() {
    while (canMove()) {
      move();

      if (isOnBucket()) {
        takeAllPaint();
      }
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice A
   */
  public void paintSquare(String color) {
    while (hasPaint()) {
      paint(color);
      move();

      if (!canMove()) {
        turnRight();
      }
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice B
   */
  public void paintDashes(String color) {
    paint(color);
    
    if (canMove()) {
      move();
    }
    
    paint(color);

    if (canMove()) {
      move();
    }

    if (canMove()) {
      move();
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice C
   */
  public void paintFast(String color) {
    while (canMove()) {
      move();
      
      if (isOnBucket()) {
        takeAllPaint();
      }

      if (hasPaint()) {
        paint(color);
      }
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice C
   */
  public void paintTruckBorder(String color) {
    while (hasPaint()) {
      paintFast(color);

      if (!canMove()) {
        turnLeft();
      }
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice D
   */
  public void paintFastAndTurn(String color) {
    while (canMove()) {
      move();

      if (isOnBucket()) {
        takeAllPaint();
      }

      if (hasPaint()) {
        paint(color);
      }

      if (!canMove()) {
        makeTurn();
      }
    }
  }

  /*
   * Unit 1 Lesson 12 - Choice D
   */
  public void makeTurn() {
    if (isFacingEast()) {
      turnRight();
    }
    else {
      turnLeft();
    }
  }

  /*
   * Unit 3 Lesson 3 - Choice C
   */
  public void paintPark(String[] colors) {
    for (int index = 0; index < colors.length; index++) {
      paintLine(colors[index]);
      turnLeft();
    }
  }

  /*
   * Unit 3 Lesson 3 - Choice D
   */
  public void navigateTraffic(String[] colors) {
    for (int index = 0; index < colors.length; index++) {
      paintLine(colors[index]);
      turnRight();
      paintLine(colors[index]);
      turnLeft();
    }
  }
  
}