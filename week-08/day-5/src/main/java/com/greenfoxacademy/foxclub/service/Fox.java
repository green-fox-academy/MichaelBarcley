package com.greenfoxacademy.foxclub.service;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Fox() {
    tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public void learnTrick(String trick) {
    if (!tricks.contains(trick)) {
      tricks.add(trick);
    }
  }
}
