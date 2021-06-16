package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class WhileNotZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int counter = 0;
    int sum = 0;
    int userValue = sc.nextInt();

    for (; userValue != 0; ) {
      counter++;
      sum += userValue;
      System.out.print("Enter one more number: ");
      userValue = sc.nextInt();
    }


    System.out.println("Entered " + counter + " values.");
    System.out.println("Sum is: " + sum + ".");

//    while (userValue != 0) {
//      counter++;
//      sum += userValue;
//      System.out.print("Enter one more number: ");
//      userValue = sc.nextInt();
//    }

//    int userValue = 0;
//    do {
//      System.out.print("Enter a number: ");
//      userValue = sc.nextInt();
//
//      if (userValue == 0) {
//        break;
//      }
//
//      counter++;
//      sum += userValue;
//    } while (userValue != 0);


//    System.out.println("Entered " + counter + " values.");
//    System.out.println("Sum is: " + sum + ".");
  }
}
