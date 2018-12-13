package com.greenfoxacademy.dependencyinjection.controller;

import com.greenfoxacademy.dependencyinjection.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Useful {

  @Autowired
  UtilityService utilService;

  @RequestMapping("/useful")
  public String usefulIndex() {
    return "useful";
  }
}
