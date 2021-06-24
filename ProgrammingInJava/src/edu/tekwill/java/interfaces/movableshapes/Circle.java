package edu.tekwill.java.interfaces.movableshapes;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class Circle implements IMovable {

  private Point center;
  private int radius;

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public void moveUp(int distance) {
    center.setY(center.getY() + distance);
  }

  @Override
  public void moveDown(int distance) {
    center.setY(center.getY() - distance);
  }

  @Override
  public void moveLeft(int distance) {
    center.setY(center.getX() - distance);
  }

  @Override
  public void moveRight(int distance) {
    center.setX(center.getX() + distance);
  }

  @Override
  public String toString() {
    return "Circle{" +
            "center=" + center +
            ", radius=" + radius +
            '}';
  }
}
