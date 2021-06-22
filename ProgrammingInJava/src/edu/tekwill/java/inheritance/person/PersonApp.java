package edu.tekwill.java.inheritance.person;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class PersonApp {
  public static void main(String[] args) {
    Person somePerson = new Person("Tom", "LA");
    System.out.println(somePerson);

    Student someStudent = new Student("Mike", "NY", "IT", 2000, 20);
    System.out.println(someStudent);

    Staff someStaff = new Staff("Julia", "CA", "Boston", 2022);
    System.out.println(someStaff);
  }
}
