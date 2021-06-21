package edu.tekwill.java.oop;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class StudentApp {
  public static void main(String[] args) {
    Student someStudent = new Student();
    someStudent.name = "Tom";
    someStudent.printState();
  }
}
