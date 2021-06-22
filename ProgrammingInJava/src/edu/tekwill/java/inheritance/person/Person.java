package edu.tekwill.java.inheritance.person;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class Person {
  private String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return String.format("Person[name=%s, address=%s]", name, address);
//    return "Person[name=" + name + ", address=" + address + "]";
  }
}
