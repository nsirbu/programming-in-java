package edu.tekwill.java.exceptions.divisibleby7;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class DivisibleBy7App {
  public static void main(String[] args) {
    DivisibleBy7 divisibleBy7 = new DivisibleBy7();
    try {
      int divisibleNumbers = divisibleBy7.divisibleBy7(400, 100);
      System.out.println(divisibleNumbers);
    } catch (InvalidRangeException ex) {
      System.out.println(ex);
    }
  }
}
