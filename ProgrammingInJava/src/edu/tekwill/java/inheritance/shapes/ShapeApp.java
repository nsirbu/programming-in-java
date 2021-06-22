package edu.tekwill.java.inheritance.shapes;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class ShapeApp {

  public static void main(String[] args) {
    Circle someCircle = new Circle(3);
    Square someSquare = new Square(4);
    Sphere someSphere = new Sphere(5);
    Cube someCube = new Cube(6);

    System.out.println("Circle area: " + someCircle.getArea());
    System.out.println("Square area: " + someSquare.getArea());
    System.out.println("Sphere area: " + someSphere.getArea());
    System.out.println("Square volume: " + someSphere.getVolume());
    System.out.println("Cube area: " + someCube.getArea());
    System.out.println("Cube volume: " + someCube.getVolume());
  }
}
