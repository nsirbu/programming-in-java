package edu.tekwill.java.exceptions.hexadecimalchecker;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class HexadecimalCheckerApp {
  public static void main(String[] args) {
    HexadecimalChecker checker = new HexadecimalChecker();
    try {
      System.out.println(checker.isValidHex("abc"));
    } catch (InvalidHexException e) {
      System.out.println(e.getMessage());
    }
  }
}
