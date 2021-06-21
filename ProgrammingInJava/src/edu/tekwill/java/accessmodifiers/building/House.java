package edu.tekwill.java.accessmodifiers.building;

import edu.tekwill.java.accessmodifiers.library.Book;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class House {

  void doSomething() {
    Book book = new Book();
    book.isbn = "abc";
    book.printBook();

//    book.issueCount = 1;
//    book.issueHistory();

  }
}
