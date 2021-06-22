package edu.tekwill.java.arraylists;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class ListItemReverser {


  public ArrayList<String> reversItems(ArrayList<String> items) {
    ListIterator<String> it = items.listIterator();
    while (it.hasNext()) {
      StringBuilder sb = new StringBuilder(it.next());
      sb.reverse();
      it.set(sb.toString());
    }

    return items;
  }
}
