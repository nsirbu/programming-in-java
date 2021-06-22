package edu.tekwill.java.inheritance.shapes;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Sphere extends ThreeDimensionalShape {

  private int radius;

  public Sphere(int radius) {
    this.radius = radius;
  }

  @Override
  public double getVolume() {
    return (4 / 3d) * Math.PI * Math.pow(radius, 3);
  }

  @Override
  public double getArea() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }
}
