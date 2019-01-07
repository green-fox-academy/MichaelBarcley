package com.gfa.w10d01.controller;

import com.gfa.w10d01.model.DoUntil;
import com.gfa.w10d01.model.Doubling;
import com.gfa.w10d01.model.Until;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/appenda")
  public Object appendaRoot() {
    return new ResponseEntity(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/appenda/{appendthis}")
  public Object appendA(@PathVariable String appendthis) {
    HashMap<String, String> appendWithA = new HashMap<>();
    appendWithA.put("appended", appendthis + "a");
    return appendWithA;
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action, @RequestBody Until until) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.sum(until);
      return sumUntil;
    } else if (action.equals("factor")) {
      DoUntil factUntil = new DoUntil();
      factUntil.factorial(until);
      return factUntil;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a number!");
      return error;
    }
  }
}
