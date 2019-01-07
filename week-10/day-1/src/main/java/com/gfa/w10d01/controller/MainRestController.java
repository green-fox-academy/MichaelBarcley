package com.gfa.w10d01.controller;

import com.gfa.w10d01.model.*;
import com.gfa.w10d01.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MainRestController {

  private EntryService entryService;

  @Autowired
  public MainRestController(EntryService entryService) {
    this.entryService = entryService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling();
      doubling.setReceived(input);
      doubling.doDoubling();

      Entry entry = new Entry("/doubling", String.format("input=%s", input));
      entryService.addEntry(entry);

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
      Entry entry = new Entry("/greeting", String.format("name=%s&title=%s", name, title));
      entryService.addEntry(entry);
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
    Entry entry = new Entry("/appendA", String.format("/%s", appendthis));
    entryService.addEntry(entry);
    return appendWithA;
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action, @RequestBody Until until) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.sum(until);
      Entry entry = new Entry("/dountil", String.format("/%s", action));
      entryService.addEntry(entry);
      return sumUntil;
    } else if (action.equals("factor")) {
      DoUntil factUntil = new DoUntil();
      factUntil.factorial(until);
      Entry entry = new Entry("/dountil", String.format("/%s", action));
      entryService.addEntry(entry);
      return factUntil;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a number!");
      return error;
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody ArrayHandler arrayHandler) {
    if (arrayHandler.getWhat().equals("sum")) {
      arrayHandler.setResult(arrayHandler.sum());
      HashMap<String, Object> result = new HashMap<>();
      result.put("result", arrayHandler.getResult());
      Entry entry = new Entry("/arrays", "");
      entryService.addEntry(entry);
      return result;
    } else if (arrayHandler.getWhat().equals("multiply")) {
      arrayHandler.setResult(arrayHandler.multiply());
      HashMap<String, Object> result = new HashMap<>();
      result.put("result", arrayHandler.getResult());
      Entry entry = new Entry("/arrays", "");
      entryService.addEntry(entry);
      return result;
    } else if (arrayHandler.getWhat().equals("double")) {
      arrayHandler.setResult(arrayHandler.doubleNumbers());
      HashMap<String, Object> result = new HashMap<>();
      result.put("result", arrayHandler.getResult());
      Entry entry = new Entry("/arrays", "");
      entryService.addEntry(entry);
      return result;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please make sure you provided both the operation and the numbers!");
      return error;
    }
  }

  @GetMapping("/log")
  public Object getLogs() {
    EntryLog log = new EntryLog();
    log.setValues(entryService.listEntries());
    return log;
  }
}
