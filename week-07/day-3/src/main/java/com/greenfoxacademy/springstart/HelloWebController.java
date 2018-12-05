package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong id = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false, defaultValue = " World") String name) {
    model.addAttribute("name", name);
    id.addAndGet(1);
    model.addAttribute("id", id);
    return "greeting";
  }
}
