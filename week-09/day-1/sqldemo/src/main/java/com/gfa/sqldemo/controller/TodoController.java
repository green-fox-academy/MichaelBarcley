package com.gfa.sqldemo.controller;

import com.gfa.sqldemo.model.Assignee;
import com.gfa.sqldemo.model.Todo;
import com.gfa.sqldemo.service.AssigneeServiceImpl;
import com.gfa.sqldemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  TodoService todoService;
  AssigneeServiceImpl assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeServiceImpl assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
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
    model.addAttribute("assignee", assigneeService.getAllAssignee());
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
    model.addAttribute("assignee", assigneeService.getAllAssignee());
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

  @GetMapping("/assignees")
  public String listAssignees (Model model) {
    model.addAttribute("assignees", assigneeService.getAllAssignee());
    return "assignees";
  }

  @GetMapping(value = "/assignees/{id}/edit")
  public String editAssigneePage(Model model, @PathVariable long id) {
    model.addAttribute("assignee", assigneeService.getAssigneeById(id));
    return "editassignee";
  }

  @PostMapping(value = "/assignees/{id}/edit")
  public String editAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.saveNewAssignee(assignee);
    return "redirect:/assignees";
  }

  @GetMapping("/assignees/addmember")
  public String addAssigneePage(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addassignee";
  }

  @PostMapping("/assignees/addmember")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.saveNewAssignee(assignee);
    return "redirect:/assignees";
  }
}
