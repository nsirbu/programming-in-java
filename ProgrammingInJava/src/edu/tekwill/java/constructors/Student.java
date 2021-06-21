package edu.tekwill.java.constructors;

import java.util.Random;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class Student {
  private String name;

  Student() {
    this("Unknown");
  }

  /**
   * Initializes the Student object with the name received as argument.
   *
   * @param name the name to be set on the instance variable.
   */
  Student(String name) {
    this.name = name;

    Random rd = new Random();
    rd.nextInt(101);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            '}';
  }
}
