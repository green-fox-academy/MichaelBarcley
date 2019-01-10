package com.greenfox.p2pchat.model;

public class ResponseOk {
  private String status;

  public ResponseOk(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
