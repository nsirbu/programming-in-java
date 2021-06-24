package edu.tekwill.java.interfaces.tasks;

import java.time.LocalDateTime;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public class DatabaseBackupTask extends AbstractTask implements Task {

  @Override
  public void execute() {
    setExecutedAt(LocalDateTime.now());
    System.out.println("Performing database backup...");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Backup created!");
  }
}
