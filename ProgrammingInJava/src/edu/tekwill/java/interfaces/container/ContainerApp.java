package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.DatabaseBackupTask;
import edu.tekwill.java.interfaces.tasks.DiskCleanupTask;
import edu.tekwill.java.interfaces.tasks.LogArchiveTask;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class ContainerApp {
  public static void main(String[] args) {
    AbstractContainer queue = new Queue();
    queue.push(new DatabaseBackupTask());
    queue.push(new DiskCleanupTask("D:\\temp"));
    queue.push(new LogArchiveTask("D:\\logs"));

    AbstractContainer stack = new Stack();
    stack.push(new DatabaseBackupTask());
    stack.push(new DiskCleanupTask("D:\\abc"));
    stack.push(new LogArchiveTask("D:\\def"));

    System.out.println("Queue:");
    System.out.println(queue);
    System.out.println("Stack:");
    System.out.println(stack);

    System.out.println();

//    queue.pop();
//    stack.pop();

    queue.transferFrom(stack);

    System.out.println("Queue:");
    System.out.println(queue);
    System.out.println("Stack:");
    System.out.println(stack);
  }
}
