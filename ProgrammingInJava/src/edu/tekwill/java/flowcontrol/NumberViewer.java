package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class NumberViewer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int userInput = sc.nextInt();

//    for (int iteration = 1; iteration < userInput; iteration++) {
//      System.out.print(iteration + " ");
//    }

    for (int numberToDisplay = userInput - 1; numberToDisplay > 0; numberToDisplay--) {
      System.out.print(numberToDisplay + " ");
    }
  }
}
