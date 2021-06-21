package edu.tekwill.java.constructors;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class StudentApp {
  public static void main(String[] args) {
    Student someStudent = new Student();
    System.out.println(someStudent);
    Student someOtherStudent = new Student("Mike");
    System.out.println(someOtherStudent);
  }
}
