package com.greenfox.p2pchat.controller;

import com.greenfox.p2pchat.model.Message;
import com.greenfox.p2pchat.service.MessageService;
import com.greenfox.p2pchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
  public String mainPage(Model model) {
    if (userService.getUserNumber() < 1) {
      return "register";
    }
    model.addAttribute("newMessage", new Message());
    model.addAttribute("messages", this.messageService.getAllMessage());
    return "index";
  }

  @PostMapping
  public String addNewMessage(@ModelAttribute Message message) {
    this.messageService.addMessage(message);
    return "redirect:/";
  }
}
