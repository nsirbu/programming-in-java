package edu.tekwill.java.primitives;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class ArithmeticOperators {
  public static void main(String[] args) {
    double price = 10.4;
    double tax = 3.2;
    int quantity = 10;
    double total;

    System.out.println("I want to by " + quantity + " items!");
    total = price * tax * quantity;
    System.out.println("Total cost with tax is: " + total);
  }
}
