package edu.tekwill.java.accessmodifiers.library;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class CourseBook extends Book {

  void doSomething() {
    Book book = new Book();
    book.isbn = "abc";
    book.printBook();

    book.author = "Tom";
    book.modifyTemplate();

    book.issueCount = 1;
    book.issueHistory();



  }
}
