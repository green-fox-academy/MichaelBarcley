package com.greenfoxacademy.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
//@Qualifier("Red")
public class RedColor implements MyColor {
  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    //System.out.println("It is red in color...");
    myPrinter.log("It is red in color...");
  }
}
