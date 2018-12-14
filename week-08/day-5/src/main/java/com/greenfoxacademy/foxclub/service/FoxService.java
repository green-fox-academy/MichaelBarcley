package com.greenfoxacademy.foxclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addFox(Fox fox) {
    foxes.add(fox);
  }

  public Fox getFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }
}
