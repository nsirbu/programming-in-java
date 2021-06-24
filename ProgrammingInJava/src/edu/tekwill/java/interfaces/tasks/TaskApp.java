package edu.tekwill.java.interfaces.tasks;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class TaskApp {
  public static void main(String[] args) {
    ArrayList<Task> tasksToExecute = new ArrayList<>();
    tasksToExecute.add(new DatabaseBackupTask());
    tasksToExecute.add(new DiskCleanupTask("D:\\temp"));
    tasksToExecute.add(new LogArchiveTask("D:\\logs"));

    System.out.println(tasksToExecute);

    for (Task task : tasksToExecute) {
      task.execute();
    }

    System.out.println(tasksToExecute);
  }
}
