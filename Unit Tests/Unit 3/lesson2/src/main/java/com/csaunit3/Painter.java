package com.csaunit3;

public class Painter {
    
    private int xLocation;
    private int yLocation;
    private Direction direction;
    private int remainingPaint;

    /** Creates a Painter object at (0, 0), facing East, with no paint. */
  public Painter() {
    this(0, 0, "East", 0);
  }

  /**
   * Creates a Painter object
   *
   * @param x the x location of the painter on the grid
   * @param y the y location of the painter on the grid
   * @param direction the direction the painter is facing
   * @param paint the amount of paint the painter has to start
   */
  public Painter(int x, int y, String direction, int paint) {
    this.xLocation = x;
    this.yLocation = y;
    this.direction = Direction.fromString(direction);
    this.remainingPaint = paint;
  }

  /** Turns the painter one compass direction left (i.e. North -> West). */
  public void turnLeft() {
    this.direction = this.direction.turnLeft();
  }

  /** Move the painter one square forward in the direction the painter is facing. */
  public void move() {
    if (this.direction.isNorth()) {
      this.yLocation--;
    } else if (this.direction.isSouth()) {
      this.yLocation++;
    } else if (this.direction.isEast()) {
      this.xLocation++;
    } else {
      this.xLocation--;
    }
  }

  /**
   * Add paint to the grid at the painter's location.
   *
   * @param color the color of the paint being added
   */
  public void paint(String color) {
    if (this.hasPaint()) {
      System.out.println("Painted the square");
      this.remainingPaint--;
    } else {
      System.out.println("There is no more paint in the painter's bucket");
    }
  }

  /** Removes all paint on the square where the painter is standing. */
  public void scrapePaint() {
    System.out.println("Scraped paint");
  }

  /**
   * Returns how many units of paint are in the painter's personal bucket.
   *
   * @return the units of paint in the painter's bucket
   */
  public int getMyPaint() {
    return this.remainingPaint;
  }

  /**
   * The Painter adds a single unit of paint to their personal bucket. The counter on the bucket on
   * the screen goes down. If the painter is not standing on a paint bucket, nothing happens.
   */
  public void takePaint() {
    System.out.println("Took paint from paint bucket");
    this.remainingPaint++;
  }

  /** @return True if there is paint in the square where the painter is standing. */
  public boolean isOnPaint() {
    return true;
  }

  /** @return True if there is a paint bucket in the square where the painter is standing. */
  public boolean isOnBucket() {
    return true;
  }

  /** @return True if the painter's personal bucket has paint in it. */
  public boolean hasPaint() {
    return true;
  }

  /** @return True if there is no barrier one square ahead in the requested direction. */
  public boolean canMove(String direction) {
    return true;
  }

  /** @return True if there is no barrier one square ahead in the current direction. */
  public boolean canMove() {
    return true;
  }

  /** @return the color of the square where the painter is standing. */
  public String getColor() {
    return "white";
  }

  /** @return True if facing North */
  public boolean isFacingNorth() {
    return this.direction.isNorth();
  }

  /** @return True if facing East */
  public boolean isFacingEast() {
    return this.direction.isEast();
  }

  /** @return True if facing South */
  public boolean isFacingSouth() {
    return this.direction.isSouth();
  }

  /** @return True if facing West */
  public boolean isFacingWest() {
    return this.direction.isWest();
  }

  /** @return the x coordinate of the painter's current position */
  public int getX() {
    return this.xLocation;
  }

  /** @return the y coordinate of the painter's current position */
  public int getY() {
    return this.yLocation;
  }

  /** @return the current direction the painter is facing */
  public String getDirection() {
    return this.direction.getDirectionString();
  }

  /**
   * Sets the amount of paint in the painters bucket. Does nothing if paint is negative.
   *
   * @param paint the amount of paint that should be in the painter's bucket.
   */
  public void setPaint(int paint) {
    if (paint < 0) {
      System.out.println("Paint amount must not be a negative number.");
      return;
    }

    this.remainingPaint = paint;
  }
}