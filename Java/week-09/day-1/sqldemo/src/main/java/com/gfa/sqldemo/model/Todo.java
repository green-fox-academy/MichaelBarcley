package com.gfa.sqldemo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date creationDate;

  private String title;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "assigneeId")
  private Assignee assignee;

  private boolean urgent;
  private boolean done;

  public Todo(String title, Assignee assignee) {
    this.title = title;
    this.assignee = assignee;
    this.urgent = false;
    this.done = false;
  }

  public Todo () {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}
