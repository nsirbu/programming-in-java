package edu.tekwill.java.interfaces.movableshapes;

/**
 * @author nsirbu
 * @since 24.06.2021
 */

public class Point {
  private double x;
  private double y;

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public Point(double x, double y) {
    setX(x);
    setY(y);
  }

  public Point(double n) {
    this(n, n);
  }

  public Point() {
    this(0, 0);
  }

  public void display() {
    System.out.println(this);
  }

  public String toString() {
    return ("< " + getX() + " ; " + getY() + " >");
  }
}

