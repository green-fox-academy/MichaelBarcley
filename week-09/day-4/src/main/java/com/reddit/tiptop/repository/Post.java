package com.reddit.tiptop.repository;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long postId;
  private int vote;
  private String title;
  private String url;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  private String timeSinceCreation;

  public Post() {
  }

  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTimeSinceCreation() {
    return timeSinceCreation;
  }

  public void setTimeSinceCreation(String timeSinceCreation) {
    this.timeSinceCreation = timeSinceCreation;
  }
}
