package edu.tekwill.java.interfaces.tasks;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author nsirbu
 * @since 24.06.2021
 */
public abstract class AbstractTask {

  private String id;
  private LocalDateTime createdAt;
  private LocalDateTime executedAt;

  public AbstractTask() {
    id = UUID.randomUUID().toString();
    createdAt = LocalDateTime.now();
  }

  public void setExecutedAt(LocalDateTime executedAt) {
    this.executedAt = executedAt;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" +
            "id='" + id + '\'' +
            ", createdAt=" + createdAt +
            ", executedAt=" + executedAt +
            '}';
  }
}
