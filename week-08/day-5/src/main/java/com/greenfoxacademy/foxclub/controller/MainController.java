package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @GetMapping("/")
  public String index(@RequestParam(value = "name", required = false) String petName, Model model) {
    if (petName == null) {
      return "redirect:/login";
    }
    Fox fox = foxService.getFoxByName(petName);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping("/login")
  public String createFox(@ModelAttribute Fox fox, RedirectAttributes redir) {
    foxService.addFox(fox);
    redir.addAttribute("name", fox.getName());
    return "redirect:/";
  }
}
