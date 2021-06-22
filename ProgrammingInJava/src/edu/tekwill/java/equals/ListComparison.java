package edu.tekwill.java.equals;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class ListComparison {
  public static void main(String[] args) {
    ArrayList<Employee> l1 = new ArrayList<>();
    l1.add(new Employee("Tom", 10));
    l1.add(new Employee("Mike", 12));

    ArrayList<Employee> l2 = new ArrayList<>();
    l2.add(new Employee("Tom", 10));
    l2.add(new Employee("Mike", 12));

    System.out.println("Are the lists equals: " + l1.equals(l2));
  }
}
