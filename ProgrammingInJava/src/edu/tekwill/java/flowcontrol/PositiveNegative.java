package edu.tekwill.java.flowcontrol;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class PositiveNegative {
  public static void main(String[] args) {
    int numberToCheck = -5;
    String result;

    if (numberToCheck > 0) {
      result = "Number is positive.";
    } else {
      result = "Number is negative";
    }

    result = numberToCheck > 0 ? "Number is positive." : "Number is negative";
    System.out.println(result);

  }
}
