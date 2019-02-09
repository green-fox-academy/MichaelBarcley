package com.greenfox.p2pchat.service;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class LoggingService {
  private String path;
  private String method;

  @Temporal(TemporalType.TIMESTAMP)
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

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public String getRequestData() {
    return requestData;
  }

  public void setRequestData(String requestData) {
    this.requestData = requestData;
  }

  public void soutLog() {
    if (this.logLevel.equals("INFO")) {
      System.out.println(date + " " + logLevel + " Request " + path + " " + method + " " + requestData);
    } else {
      System.err.println(date + " " + logLevel + " " + path + " " + method + " " + requestData);
    }
  }
}
