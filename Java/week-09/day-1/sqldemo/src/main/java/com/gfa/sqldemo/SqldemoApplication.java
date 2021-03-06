package com.gfa.sqldemo;

import com.gfa.sqldemo.model.Assignee;
import com.gfa.sqldemo.model.Todo;
import com.gfa.sqldemo.repository.AssigneeRepository;
import com.gfa.sqldemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqldemoApplication implements CommandLineRunner {

  TodoRepository todoRepository;
  AssigneeRepository assigneeRepository;

  @Autowired
  SqldemoApplication (TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SqldemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

