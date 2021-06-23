package edu.tekwill.java.exceptions.hexadecimalchecker;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class HexadecimalChecker {
  public boolean isValidHex(String valueToCheck) throws InvalidHexException {
    try {
      Integer.parseInt(valueToCheck, 16);
      return true;
    } catch (NumberFormatException ex) {
      throw new InvalidHexException(valueToCheck + " is not a valid HEX number!");
    }
  }
}
