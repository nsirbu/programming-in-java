package edu.tekwill.java.strings;

/**
 * @author nsirbu
 * @since 21.06.2021
 */
public class HashCheckerApp {
  public static void main(String[] args) {
    HashChecker hc = new HashChecker();
    System.out.println(hc.checkCharacterBeforeAndAfterHash("moon#night"));
    System.out.println(hc.checkCharacterBeforeAndAfterHash("#moonnight"));
    System.out.println(hc.checkCharacterBeforeAndAfterHash("moonnight#"));
  }
}
