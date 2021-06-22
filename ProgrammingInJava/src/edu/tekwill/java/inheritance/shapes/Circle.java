package edu.tekwill.java.inheritance.shapes;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Circle extends TwoDimensionalShape {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
