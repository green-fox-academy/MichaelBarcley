package com.gfa.w10d01.controller;

import com.gfa.w10d01.model.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling();
      doubling.setReceived(input);
      doubling.doDoubling();
      return doubling;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Provide an input!");
      return error;
    }
  }

  @GetMapping("/greeting")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide both a name and a title.");
      return error;
    } else if (name != null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a title!");
      return error;
    } else if (name == null && title != null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a name!");
      return error;
    } else {
      HashMap<String, String> greeter = new HashMap<>();
      greeter.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name, title));
      return greeter;
    }
  }
}
