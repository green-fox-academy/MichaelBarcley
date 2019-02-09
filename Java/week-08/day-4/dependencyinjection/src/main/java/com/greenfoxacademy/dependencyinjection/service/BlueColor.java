package com.greenfoxacademy.dependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    //System.out.println("It is blue in color...");
    myPrinter.log("It is blue in color...");
  }
}
