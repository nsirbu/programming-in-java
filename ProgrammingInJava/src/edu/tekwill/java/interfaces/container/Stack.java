package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;


/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class Stack extends AbstractContainer {

  @Override
  public Task pop() {
    Task task = tasks.get(tasks.size() - 1);
    tasks.remove(task);
    return task;
  }
}
