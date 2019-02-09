package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.BankofsimbaApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowAll {

  @RequestMapping("/showall")
  public String showAllAccounts(Model model) {
    model.addAttribute("accounts", BankofsimbaApplication.allAccounts.getListOfAccounts());
    return "showall";
  }
}
