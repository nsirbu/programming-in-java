package edu.tekwill.java.interfaces.movableshapes;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public abstract class Polygon implements IMovable {

  protected ArrayList<Point> vertices;

  public Polygon() {
    vertices = new ArrayList<>();
  }

  @Override
  public void moveUp(int distance) {
    for (Point corner : vertices) {
      corner.setY(corner.getY() + distance);
    }
  }

  @Override
  public void moveDown(int distance) {
    for (Point corner : vertices) {
      corner.setY(corner.getY() - distance);
    }
  }

  @Override
  public void moveLeft(int distance) {
    for (Point corner : vertices) {
      corner.setX(corner.getX() - distance);
    }
  }

  @Override
  public void moveRight(int distance) {
    for (Point corner : vertices) {
      corner.setX(corner.getX() + distance);
    }
  }
}
