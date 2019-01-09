package com.greenfox.p2pchat.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String text;

  @Temporal(TemporalType.TIMESTAMP)
  private Date timeStamp;

  private String username;

  public Message() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
