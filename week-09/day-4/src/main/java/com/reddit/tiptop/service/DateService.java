package com.reddit.tiptop.service;

import java.util.Date;

public class DateService {

  private static final long minute = 60;
  private static final long hour = 3600;
  private static final long day = 86400;
  private static final long month = 2629743;
  private static final long year = 31556926;

  public static String timeSinceCreation(Date date) {
    Date currentTime = new Date();
    long currentTimeInLong = currentTime.getTime();

    long timeSinceCreation = (currentTimeInLong - date.getTime()) / 600;

    if (timeSinceCreation > year) {
      int years = (int) (timeSinceCreation / year);
      return "submitted " + years + " years ago";
    } else if (timeSinceCreation > month && timeSinceCreation < year) {
      int months = (int) (timeSinceCreation / month);
      return "submitted " + months + " months ago";
    } else if (timeSinceCreation > day && timeSinceCreation < month) {
      int days = (int) (timeSinceCreation / day);
      return  "submitted " + days + " days ago";
    } else if (timeSinceCreation > hour && timeSinceCreation < day) {
      int hours = (int) (timeSinceCreation / hour);
      return "submitted " + hours + " hours ago";
    } else if (timeSinceCreation > minute && timeSinceCreation < hour) {
      int minutes = (int) (timeSinceCreation / minute);
      return "submitted " + minutes + " minutes ago";
    } else {
      int seconds = (int) timeSinceCreation;
      return "submitted " + seconds + " seconds ago";
    }
  }
}
