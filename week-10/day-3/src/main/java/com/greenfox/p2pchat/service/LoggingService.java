package com.greenfox.p2pchat.service;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoggingService {
  private String path;
  private String method;
  private Date date;
  private String logLevel;
  private String requestData;

  public LoggingService() {
  }

  public LoggingService(String path, String method, String logLevel, String requestData) {
    this.path = path;
    this.method = method;
    this.logLevel = logLevel;
    this.requestData = requestData;
    date = new Date();
  }
}
