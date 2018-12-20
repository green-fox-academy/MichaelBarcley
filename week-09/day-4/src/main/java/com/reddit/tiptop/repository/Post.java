package com.reddit.tiptop.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long postId;
  private int vote;
  private String title;
  private String url;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  public Post() {
  }

}
