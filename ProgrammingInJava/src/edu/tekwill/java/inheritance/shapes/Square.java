package edu.tekwill.java.inheritance.shapes;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Square extends TwoDimensionalShape {

  private int sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double getArea() {
    return sideLength * sideLength;
  }
}
