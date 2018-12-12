package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.BankofsimbaApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show {

  @RequestMapping("/show")
  public String show(Model model) {
    model.addAttribute("name", BankofsimbaApplication.testAccount.getName());
    model.addAttribute("balance", BankofsimbaApplication.testAccount.getBalance());
    model.addAttribute("animalType", BankofsimbaApplication.testAccount.getAnimalType());
    return "show";
  }
}
