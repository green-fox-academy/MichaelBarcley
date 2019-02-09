package com.gfa.h2demo;

import com.gfa.h2demo.model.Todo;
import com.gfa.h2demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2demoApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public H2demoApplication (TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(H2demoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Todo todo1 = new Todo("Buy milk");
    this.repository.save(todo1);
    Todo todo2 = new Todo("Prepare for demo");
    this.repository.save(todo2);
    Todo todo3 = new Todo("Play the guitar");
    this.repository.save(todo3);
  }
}

