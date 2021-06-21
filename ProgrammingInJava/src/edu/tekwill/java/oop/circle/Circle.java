package edu.tekwill.java.oop.circle;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class Circle {

  double radius;

  void calculateArea() {
//    double area = Math.PI * radius * radius;
    double area = Math.PI * Math.pow(radius, 2);
    System.out.println("Circle area is: " + area);
  }
}
