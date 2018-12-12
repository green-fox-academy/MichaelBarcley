package com.greenfoxacademy.bankofsimba.service;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;

  public BankAccount(String name, double balance, String animalType, boolean isGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.isGoodGuy = isGoodGuy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isGoodGuy() {
    return isGoodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    isGoodGuy = goodGuy;
  }
}
