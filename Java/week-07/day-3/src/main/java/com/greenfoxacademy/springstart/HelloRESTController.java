package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  private AtomicLong id;

  HelloRESTController() {
    id = new AtomicLong(0);
  }

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
    id.addAndGet(1);
    return new Greeting(id, "What's up " + name + "?");
  }
}
