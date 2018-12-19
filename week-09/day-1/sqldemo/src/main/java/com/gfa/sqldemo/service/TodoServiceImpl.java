package com.gfa.sqldemo.service;

import com.gfa.sqldemo.model.Todo;
import com.gfa.sqldemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

  TodoRepository repository;

  @Autowired
  TodoServiceImpl(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> getActiveTodos() {
    return this.repository.findAllByDoneIsFalse();
  }

  @Override
  public List<Todo> getAllTodos() {
    List<Todo> taskList = new ArrayList<>();
    this.repository.findAll().forEach(taskList::add);
    return taskList;
  }

  @Override
  public void saveNewTodo(Todo todo) {
    this.repository.save(todo);
  }

  @Override
  public void deleteTodoById(long id) {
    this.repository.deleteById(id);
  }

  @Override
  public Todo getTodoById(long id) {
    return this.repository.findById(id).orElse(null);
  }

  @Override
  public List<Todo> getAllTasksContainingInput(String searchTodo) {
    return this.repository.findAllByTitleContaining(searchTodo);
  }
}
