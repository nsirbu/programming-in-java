package edu.tekwill.java.inheritance.shapes;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Cube extends ThreeDimensionalShape {

  private int sideLength;

  public Cube(int sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double getVolume() {
    return Math.pow(sideLength, 3);
  }

  @Override
  public double getArea() {
    return 6 * Math.pow(sideLength, 2);
  }
}
