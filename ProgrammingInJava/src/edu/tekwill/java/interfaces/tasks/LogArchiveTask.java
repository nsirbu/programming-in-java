package edu.tekwill.java.interfaces.tasks;

import java.time.LocalDateTime;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class LogArchiveTask extends AbstractTask implements Task {

  private String path;

  public LogArchiveTask(String path) {
    this.path = path;
  }

  @Override
  public void execute() {
    setExecutedAt(LocalDateTime.now());
    System.out.println(String.format("Archiving content of the directory [%s]...", this.path));

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Archive has been created!");
  }
}
