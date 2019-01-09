package com.greenfox.p2pchat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
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
}
