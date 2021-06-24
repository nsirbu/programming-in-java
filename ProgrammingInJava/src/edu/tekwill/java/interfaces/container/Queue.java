package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;


/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class Queue extends AbstractContainer {

  @Override
  public Task pop() {
    Task task = tasks.get(0);
    tasks.remove(task);
    return task;
  }
}
