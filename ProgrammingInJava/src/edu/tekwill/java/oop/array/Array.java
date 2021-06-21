package edu.tekwill.java.oop.array;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class Array {
  int[] items;

  void sum() {
    int sum = 0;
    for (int value : items) {
      sum += value;
    }

    System.out.println("Sum is: " + sum);
  }

  void average() {
    int sum = 0;
    for (int value : items) {
      sum += value;
    }

    System.out.println("Average is: " + sum / items.length);
  }

  void odd() {
    int count = 0;
    for (int value : items) {
      if (value % 2 == 1) {
        count++;
      }
    }

    System.out.println("Odd values: " + count);
  }

  void even() {
    int count = 0;
    for (int value : items) {
      if (value % 2 == 0) {
        count++;
      }
    }

    System.out.println("Even values: " + count);
  }

  void length() {
    System.out.println("Length values: " + items.length);
  }
}
