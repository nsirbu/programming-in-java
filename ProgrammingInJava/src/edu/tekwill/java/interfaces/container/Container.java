package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public interface Container {

  Task pop();

  void push(Task task);

  int size();

  boolean isEmpty();

  void transferFrom(Container container);
}
