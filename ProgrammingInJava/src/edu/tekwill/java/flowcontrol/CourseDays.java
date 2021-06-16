package edu.tekwill.java.flowcontrol;

/**
 * @author nsirbu
 * @since 16.06.2021
 */
public class CourseDays {
  public static void main(String[] args) {
    String day = "MON";

    switch (day) {
      case "MON":
        System.out.println("MON");
      case "TUE":
      case "WED":
        System.out.println("WED");
      case "THU":
      case "FRI":
        System.out.println("FRI");
        break;
      case "SAT":
      case "SUN":
        System.out.println("No classes!");
    }
  }
}
