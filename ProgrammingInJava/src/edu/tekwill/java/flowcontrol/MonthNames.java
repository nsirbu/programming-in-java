package edu.tekwill.java.flowcontrol;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class MonthNames {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the index of the month: ");
    int monthIndex = sc.nextInt();

    switch (monthIndex) {
      default:
        System.out.println("Unknown month!");
        break;
      case 1:
        System.out.println("Jan");
        break;
      case 2:
        System.out.println("Feb");
        break;
      case 3:
        System.out.println("Mar");
        break;
      case 4:
        System.out.println("Apr");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("Jun");
        break;
      case 7:
        System.out.println("Jul");
        break;
      case 8:
        System.out.println("Aug");
        break;
      case 9:
        System.out.println("Sept");
        break;
      case 10:
        System.out.println("Oct");
        break;
      case 11:
        System.out.println("Nov");
        break;
      case 12:
        System.out.println("Dec");
        break;
    }
  }
}
