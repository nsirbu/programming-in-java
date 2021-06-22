package edu.tekwill.java.arraylists;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class PluralsRemoval {
  public ArrayList<String> removePlurals(ArrayList<String> listToProcess) {
    ListIterator<String> it = listToProcess.listIterator();
    while (it.hasNext()) {
      String word = it.next();
      if (word.endsWith("s") || word.endsWith("S")) {
        it.remove();
      }
    }

    return listToProcess;
  }
}
