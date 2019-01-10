package com.greenfox.p2pchat.model;

public class ResponseError {
  private String status;
  private String message;

  public ResponseError(String status, String message) {
    this.status = status;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
