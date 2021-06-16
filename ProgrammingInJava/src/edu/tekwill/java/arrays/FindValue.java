package edu.tekwill.java.arrays;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class FindValue {
  public static void main(String[] args) {
    int[] someNumbers = {4, 6, 8, -2};

    int valueToFind = 3;
    boolean found = false;

//    for (int iteration = 0; iteration < someNumbers.length; iteration++) {
//      if (someNumbers[iteration] == valueToFind) {
//        found = true;
//        break;
//      }
//    }

    for (int value : someNumbers) {
      if (value == valueToFind) {
        found = true;
        break;
      }
    }

    System.out.println(found);
  }
}
