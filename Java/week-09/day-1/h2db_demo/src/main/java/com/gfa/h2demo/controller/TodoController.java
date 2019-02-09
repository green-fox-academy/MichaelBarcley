package com.gfa.h2demo.controller;

import com.gfa.h2demo.model.Todo;
import com.gfa.h2demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

  TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("listOfTodos", this.repository.findAll());
    return "index";
  }
}
