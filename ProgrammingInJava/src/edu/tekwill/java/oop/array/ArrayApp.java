package edu.tekwill.java.oop.array;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class ArrayApp {
  public static void main(String[] args) {
    Array someArray = new Array();
//    someArray.items = new int[]{3, 4, 5, 6, 8};

    someArray.sum();
    someArray.odd();
    someArray.even();
    someArray.average();
  }
}
