package edu.tekwill.java.accessmodifiers.constants;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class ConstantsApp {
  public static void main(String[] args) {
    System.out.println(Constants.PI);
    Constants.doSomeWork();

    Constants c = new Constants();
    System.out.println(c.PI);
    c.doSomeWork();
  }
}
