package com.greenfox.p2pchat.controller;

import com.greenfox.p2pchat.service.MessageService;
import com.greenfox.p2pchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private MessageService messageService;
  private UserService userService;

  @Autowired
  public MainController(MessageService messageService, UserService userService) {
    this.messageService = messageService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String mainPage() {
    if (userService.getUserNumber() < 1) {
      return "register";
    }
    return "index";
  }
}
