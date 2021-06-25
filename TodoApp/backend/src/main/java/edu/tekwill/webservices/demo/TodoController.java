package edu.tekwill.webservices.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nsirbu
 */
@CrossOrigin
@RestController
@RequestMapping(value = "todos")
public class TodoController {

  static List<Todo> todoCollection = new ArrayList<>(Arrays.asList(
          new Todo(UUID.randomUUID().toString(), "Read a book about Java", false),
          new Todo(UUID.randomUUID().toString(), "Complete the homework", false),
          new Todo(UUID.randomUUID().toString(), "Create a Maven project", false)
  ));

  @GetMapping
  public ResponseEntity<List<Todo>> getAllTodos() {
    return ResponseEntity.ok(todoCollection);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Todo> getTodoById(@PathVariable(value = "id") String id) {
    for (Todo todo : todoCollection) {
      if (todo.getId().equals(id)) {
        return ResponseEntity.ok(todo);
      }
    }

    return ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
    todo.setId(UUID.randomUUID().toString());
    todoCollection.add(todo);
    return ResponseEntity.ok(todo);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Todo> updateTodo(@PathVariable(value = "id") String id, @RequestBody Todo todo) {
    for (int i = 0; i < todoCollection.size(); i++) {
      if (todoCollection.get(i).getId().equals(id)) {
        todo.setId(id);
        todo.setCompleted(true);
        todoCollection.set(i, todo);
        return ResponseEntity.ok(todo);
      }
    }

    return ResponseEntity.notFound().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteTodo(@PathVariable(value = "id") String id) {
    for (Todo todo : todoCollection) {
      if (todo.getId().equals(id)) {
        todoCollection.remove(todo);
        return ResponseEntity.ok().build();
      }
    }

    return ResponseEntity.notFound().build();
  }
}