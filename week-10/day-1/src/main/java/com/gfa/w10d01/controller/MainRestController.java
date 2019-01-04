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
      HashMap<String, String> hashy = new HashMap();
      hashy.put("error", "Provide an input!");
      return hashy;
    }
  }
}
