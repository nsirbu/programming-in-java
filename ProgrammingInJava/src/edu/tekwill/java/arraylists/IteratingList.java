package edu.tekwill.java.arraylists;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class IteratingList {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(4);
    numbers.add(2);
    numbers.add(56);

    for (int index = 0; index < numbers.size(); index++) {
      System.out.print(numbers.get(index) + " ");
    }

    System.out.println();

    for (Integer value : numbers) {
      System.out.print(value + " ");
    }

    System.out.println();

    int index = 0;
    while (index < numbers.size()) {
      System.out.print(numbers.get(index) + " ");
      index++;
    }

    System.out.println();

    ListIterator<Integer> it = numbers.listIterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
