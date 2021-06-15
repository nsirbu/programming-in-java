package edu.tekwill.java.flowcontrol;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class TriangleType {
  public static void main(String[] args) {
    int sideOne = 3;
    int sideTwo = 3;
    int sideThree = 8;

    if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
      if (sideOne == sideTwo && sideOne == sideThree) {
        System.out.println("Equilateral");
      } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
        System.out.println("Isosceles");
      } else {
        System.out.println("Scalene");
      }
    } else {
      System.out.println("Not a triangle!");
    }
  }
}
