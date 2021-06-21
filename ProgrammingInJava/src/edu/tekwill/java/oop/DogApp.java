package edu.tekwill.java.oop;

/**
 * @author nsirbu
 * @since 17.06.2021
 */
public class DogApp {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();

    dog1.age = 1;
    dog2.age = 2;

    int var1 = 10;
    int var2 = 11;

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(var1);
    System.out.println(var2);

    var1 = var2;
    dog1 = dog2;

    System.out.println("+++++++++++++++++++++++");
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(var1);
    System.out.println(var2);

    var1 = 12;
    dog1.age = 3;

    System.out.println("+++++++++++++++++++++++");
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(var1);
    System.out.println(var2);


  }
}
