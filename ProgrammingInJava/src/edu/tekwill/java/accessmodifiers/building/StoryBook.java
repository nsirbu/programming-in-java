package edu.tekwill.java.accessmodifiers.building;

import edu.tekwill.java.accessmodifiers.library.Book;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class StoryBook extends Book {

  void doSomething() {
    Book book = new Book();
    book.isbn = "abc";
    book.printBook();

    author = "Tom";
    modifyTemplate();

//    book.issueCount = 1;
//    book.issueHistory();


  }
}
