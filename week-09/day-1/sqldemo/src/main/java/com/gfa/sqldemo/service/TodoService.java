package com.gfa.sqldemo.service;

import com.gfa.sqldemo.model.Todo;

import java.util.List;

public interface TodoService {
  public List<Todo> getActiveTodos();
  public List<Todo> getAllTodos();
  public void saveNewTodo(Todo todo);
  public void deleteTodoById(long id);
  public Todo getTodoById(long id);
}
