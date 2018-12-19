package com.gfa.sqldemo.controller;

import com.gfa.sqldemo.model.Todo;
import com.gfa.sqldemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/")
  public String index(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("listOfTodos", todoService.getActiveTodos());
    } else {
      model.addAttribute("listOfTodos", todoService.getAllTodos());
    }
    return "index";
  }

  @GetMapping("/addtodo")
  public String addItemPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String addItem(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteItem(@PathVariable long id) {
    todoService.deleteTodoById(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/edit")
  public String editItemPage(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "edittodo";
  }

  @PostMapping(value = "/{id}/edit")
  public String editItem(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/";
  }

  @GetMapping("/search")
  public String listItemsMatchingSearch(Model model, @RequestParam("searchTodo")String searchTodo) {
    model.addAttribute("listOfTodos", todoService.getAllTasksContainingInput(searchTodo));
    return "index";
  }
}
