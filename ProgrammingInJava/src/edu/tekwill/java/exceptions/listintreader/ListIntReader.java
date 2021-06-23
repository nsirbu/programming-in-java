package edu.tekwill.java.exceptions.listintreader;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class ListIntReader {

  public int getDigitsSum(String stringToParse) {
    // 12, 2 , 3, h, k , 3

    String[] items = stringToParse.split(",");
    int sum = 0;

    for (String item : items) {
      String itemToConvert = item.trim();
      try {
        int converted = Integer.parseInt(itemToConvert);
        sum += converted;
      } catch (NumberFormatException exception) {
        System.out.println("Could not convert [" + itemToConvert + "] to int.");
      }
    }

    return sum;
  }
}
