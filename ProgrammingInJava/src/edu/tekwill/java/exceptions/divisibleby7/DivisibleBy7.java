package edu.tekwill.java.exceptions.divisibleby7;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class DivisibleBy7 {

  public int divisibleBy7(int from, int to) throws InvalidRangeException {
    if (from >= to) {
      throw new InvalidRangeException("Invalid range: minimum is greater or equal than maximum.");
    }

    int counter = 0;
    for (int value = from; value <= to; value++) {
      if (value % 7 == 0) {
        counter++;
      }
    }

    return counter;
  }
}
