package edu.tekwill.java.strings;

/**
 * @author nsirbu
 * @since 21.06.2021
 */
public class HashChecker {

  public boolean checkCharacterBeforeAndAfterHash(String stringToCheck) {
    int hashPosition = stringToCheck.indexOf('#');

    //moon#night

    if (hashPosition > 0 && hashPosition < stringToCheck.length() - 2) {
      if (stringToCheck.charAt(hashPosition - 1) == stringToCheck.charAt(hashPosition + 1)) {
        return true;
      }
    }

    return false;
  }
}
