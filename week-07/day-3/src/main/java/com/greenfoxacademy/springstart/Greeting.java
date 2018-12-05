package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private AtomicLong id;
  private String content;

  Greeting(AtomicLong id, String content) {
    this.id = id;
    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public void setId(AtomicLong id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
