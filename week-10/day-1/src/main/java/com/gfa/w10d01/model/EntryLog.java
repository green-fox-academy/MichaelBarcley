package com.gfa.w10d01.model;

public class EntryLog {

  private long id;
  private String endPoint;
  private String data;

  public EntryLog() {
  }

  public EntryLog(long id, String endPoint, String data) {
    this.id = id;
    this.endPoint = endPoint;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
