package edu.tekwill.java.interfaces.tasks;

import java.time.LocalDateTime;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class DiskCleanupTask extends AbstractTask implements Task {

  private String path;

  public DiskCleanupTask(String path) {
    this.path = path;
  }

  @Override
  public void execute() {
    setExecutedAt(LocalDateTime.now());
    System.out.println(String.format("Cleaning up directory [%s]...", this.path));

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Cleanup done!");
  }
}
