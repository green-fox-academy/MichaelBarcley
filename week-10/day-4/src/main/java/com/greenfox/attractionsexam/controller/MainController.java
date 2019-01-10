package com.greenfox.attractionsexam.controller;

import com.greenfox.attractionsexam.model.Attraction;
import com.greenfox.attractionsexam.model.User;
import com.greenfox.attractionsexam.service.AttractionService;
import com.greenfox.attractionsexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private AttractionService attractionService;
  private UserService userService;

  @Autowired
  public MainController(AttractionService attractionService, UserService userService) {
    this.attractionService = attractionService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("allAttraction", this.attractionService.getAllItem());
    model.addAttribute("attraction", new Attraction());
    model.addAttribute("users", this.userService.getAllUser());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(@ModelAttribute Attraction attraction) {
    this.attractionService.addItem(attraction);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editAttraction(@PathVariable long id, Model model) {
    model.addAttribute("allAttraction", this.attractionService.getAllItem());
    model.addAttribute("attraction", this.attractionService.getAttractionById(id));
    model.addAttribute("users", this.userService.getAllUser());
    return "edit";
  }

  @PostMapping("/edit/{id}")
  public String saveEditedAttraction(@ModelAttribute Attraction attraction, @PathVariable long id) {
    this.attractionService.addItem(attraction);
    return "redirect:/";
  }
}
