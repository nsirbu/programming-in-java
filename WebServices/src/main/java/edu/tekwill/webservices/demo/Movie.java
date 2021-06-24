//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package edu.tekwill.webservices.demo;

import java.util.List;

/**
 *
 * @since 02-Dec-2018
 * @author nsirbu
 */
public class Movie {

  private String id;
  private String name;
  private List<String> genre;
  private int releaseYear;
  private double rating;

  public Movie() {
  }

  public Movie(String id, String name, List<String> genre, int releaseYear, double rating) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.releaseYear = releaseYear;
    this.rating = rating;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getGenre() {
    return genre;
  }

  public void setGenre(List<String> genre) {
    this.genre = genre;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Movie{" + "id=" + id + ", name=" + name + ", genre=" + genre + ", releaseYear=" + releaseYear + ", rating=" + rating + '}';
  }
}
