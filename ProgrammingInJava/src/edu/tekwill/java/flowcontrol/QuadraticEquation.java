package edu.tekwill.java.flowcontrol;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class QuadraticEquation {
  public static void main(String[] args) {
    // ax2 + bx + c = 0
    int a = 10;
    int b = 45;
    int c = 1;
    double x1, x2;

    double discriminant = b * b - 4 * a * c;
    if (discriminant == 0) {
      x1 = x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
      System.out.println(x1);
    } else if (discriminant > 0) {
      x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println(x1);
      System.out.println(x2);
    } else {
      System.out.println("No roots!");
    }
  }
}
