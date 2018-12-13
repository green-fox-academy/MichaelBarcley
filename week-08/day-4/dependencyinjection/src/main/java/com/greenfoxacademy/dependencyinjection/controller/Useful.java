package com.greenfoxacademy.dependencyinjection.controller;

import com.greenfoxacademy.dependencyinjection.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Useful {

  @Autowired
  UtilityService utilService;

  @GetMapping("/useful")
  public String usefulIndex() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", utilService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String isEmailValid (Model model,
                              @RequestParam(value = "email", required = false, defaultValue = "example@example.com") String email) {
    if (utilService.validateEmail(email)) {
      model.addAttribute("color", "green");
      model.addAttribute("text", email + " is a valid email address.");
    } else {
      model.addAttribute("color", "red");
      model.addAttribute("text", email + " is not a valid email address.");
    }
    return "validemail";
  }

  @GetMapping("useful/caesar")
  public String caesarCypher (Model model,
                              @RequestParam(value = "text", required = false, defaultValue = "Caesar") String text,
                              @RequestParam(value = "num", required = false, defaultValue = "1") int num) {
    model.addAttribute("text", utilService.caesar(text, num));
    return "caesar";
  }
}
