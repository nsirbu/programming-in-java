package edu.tekwill.java.arraylists;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 22.06.2021
 */
public class ListItemReverserApp {

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>();
    words.add("apples");
    words.add("banana");
    words.add("orangeS");

    ListItemReverser lr = new ListItemReverser();
    System.out.println(lr.reversItems(words));
  }
}
