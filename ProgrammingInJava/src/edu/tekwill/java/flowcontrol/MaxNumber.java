package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class MaxNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int firstNumber = sc.nextInt();
    sc.nextLine();
    System.out.print("Please enter the second number: ");
    int secondNumber = sc.nextInt();

//    int max;
//    if (firstNumber > secondNumber) {
//      max = firstNumber;
//    } else {
//      max = secondNumber;
//    }

    int max = firstNumber > secondNumber ? firstNumber : secondNumber;
    System.out.println("Max is: " + max);
  }
}
