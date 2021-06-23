package edu.tekwill.java.exceptions.listintreader;

/**
 * @author nsirbu
 * @since 23.06.2021
 */
public class ListIntReaderApp {
  public static void main(String[] args) {
    ListIntReader reader = new ListIntReader();
    System.out.println(reader.getDigitsSum("12, 2 , 3, h, k , 3"));
  }
}
