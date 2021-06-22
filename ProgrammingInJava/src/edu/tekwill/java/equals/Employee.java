package edu.tekwill.java.equals;

import java.util.UUID;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Employee {

  String id;
  String name;
  double salary;

  public Employee(String name, double salary) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.salary = salary;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object instanceof Employee) {
      Employee other = (Employee) object;
      if (this.name.equals(other.name) && this.salary == other.salary) {
        return true;
      }
    }

    return false;
  }
}
