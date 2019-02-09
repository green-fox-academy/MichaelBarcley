package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.BankofsimbaApplication;
import com.greenfoxacademy.bankofsimba.service.BankAccount;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddAccount {

  @GetMapping("/addaccount")
  public String addAccountForm() {
    return "addaccount";
  }

  @PostMapping(
      value="/showall",
      consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String addAccount(@RequestBody MultiValueMap<String, String> formData) {
    BankAccount newAccount = new BankAccount(
        formData.toSingleValueMap().get("name"),
        0,
        formData.toSingleValueMap().get("animaltype"),
        true
    );
    BankofsimbaApplication.allAccounts.addAccount(newAccount);
    return "redirect:/showall";
  }
}
