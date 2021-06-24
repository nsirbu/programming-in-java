//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package edu.tekwill.webservices.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author nsirbu
 * @since 02-Dec-2018
 */
@RestController
@RequestMapping(value = "movies")
public class MovieController {

  static List<Movie> movieCollection = new ArrayList<>(Arrays.asList(
          new Movie("1", "The Grinch", Arrays.asList("Animation", "Comedy", "Family"), 2018, 6.4),
          new Movie("2", "The Christmas Chronicles", Arrays.asList("Adventure", "Comedy", "Family"), 2018, 7.4),
          new Movie("3", "Christopher Robin", Arrays.asList("Animation", "Adventure", "Comedy"), 2018, 7.5)
  ));

  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies() {
    return ResponseEntity.ok(movieCollection);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Movie> getMovieById(@PathVariable(value = "id") String id) {
    for (Movie movie : movieCollection) {
      if (movie.getId().equals(id)) {
        return ResponseEntity.ok(movie);
      }
    }

    return ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<Void> createMovie(@RequestBody Movie movie) {
    movie.setId(UUID.randomUUID().toString());
    movieCollection.add(movie);

    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> updateMovie(@PathVariable(value = "id") String id, @RequestBody Movie movie) {
    for (int i = 0; i < movieCollection.size(); i++) {
      if (movieCollection.get(i).getId().equals(id)) {
        movie.setId(id);
        movieCollection.set(i, movie);
        return new ResponseEntity<>(HttpStatus.OK);
      }
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteMovie(@PathVariable(value = "id") String id) {
    for (Movie movie : movieCollection) {
      if (movie.getId().equals(id)) {
        movieCollection.remove(movie);
        return new ResponseEntity<>(HttpStatus.OK);
      }
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
