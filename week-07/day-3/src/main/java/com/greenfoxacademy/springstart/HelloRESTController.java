package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting() {
    return new Greeting(1, "What's up mateys?!");
  }
}
