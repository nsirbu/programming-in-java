package edu.tekwill.java.methods.overloading;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class ParallelogramApp {
  public static void main(String[] args) {
    Parallelogram parallelogram = new Parallelogram();
    System.out.println("Area is : " + parallelogram.calculateArea(3, 4));
    System.out.println("Perimeter is: " + parallelogram.calculatePerimeter(2));
  }
}
