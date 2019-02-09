package com.greenfox.mocktest.model;

public class ArrowOfYondu {

  private double distance;
  private double time;
  private double speed;

  public ArrowOfYondu(double distance, double time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance / time;
  }

  public ArrowOfYondu() {
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}
