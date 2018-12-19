package com.gfa.sqldemo.repository;

import com.gfa.sqldemo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
