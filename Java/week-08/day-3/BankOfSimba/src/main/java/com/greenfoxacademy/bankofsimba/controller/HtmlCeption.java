package com.greenfoxacademy.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlCeption {

  @RequestMapping("/htmlception")
  public String htmlCeption(Model model) {
    model.addAttribute("enjoy", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }
}
