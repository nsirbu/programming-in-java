package edu.tekwill.java.methods;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class PositiveNegativeApp {
  public static void main(String[] args) {
    PositiveNegativeChecker checker = new PositiveNegativeChecker();
    System.out.println("Is positive: " + checker.isPositive(6));
    System.out.println("Is negative: " + !checker.isPositive(6));
  }
}
