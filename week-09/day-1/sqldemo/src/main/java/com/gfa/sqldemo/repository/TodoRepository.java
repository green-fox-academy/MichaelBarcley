package com.gfa.sqldemo.repository;

import com.gfa.sqldemo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneIsFalse();
  List<Todo> findAllByTitleContaining(String searchTodo);
}
