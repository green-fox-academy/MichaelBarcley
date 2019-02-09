package com.greenfox.mocktest.model;

public class GrootTranslater {

  private String received;
  private String translated;

  public GrootTranslater(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public GrootTranslater() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
