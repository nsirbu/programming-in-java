package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public abstract class AbstractContainer implements Container {

  protected List<Task> tasks;

  public AbstractContainer() {
    tasks = new ArrayList<>();
  }

  @Override
  public void push(Task task) {
    tasks.add(task);
  }

  @Override
  public int size() {
    return tasks.size();
  }

  @Override
  public boolean isEmpty() {
    return tasks.isEmpty();
  }

  @Override
  public void transferFrom(Container container) {
    while (!container.isEmpty()) {
      push(container.pop());
    }
  }

  @Override
  public String toString() {
    return "AbstractContainer{" +
            "tasks=" + tasks +
            '}';
  }
}
