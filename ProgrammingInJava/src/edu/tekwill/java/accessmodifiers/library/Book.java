package edu.tekwill.java.accessmodifiers.library;

/**
 * @author nsirbu
 * @since 18.06.2021
 */
public class Book {
  public String isbn;
  protected String author;
  int issueCount;
  private int pages;

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getIssueCount() {
    return issueCount;
  }

  public void setIssueCount(int issueCount) {
    this.issueCount = issueCount;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public void printBook() {

  }

  protected void modifyTemplate() {

  }

  void issueHistory() {
    countPages();
    pages = 3;
  }

  private void countPages() {

  }
}
