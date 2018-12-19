package com.gfa.sqldemo.service;

import com.gfa.sqldemo.model.Assignee;
import com.gfa.sqldemo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Assign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> getAllAssignee() {
    List<Assignee> assigneeList = new ArrayList<>();
    this.assigneeRepository.findAll().forEach(assigneeList::add);
    return assigneeList;
  }

  @Override
  public Assignee getAssigneeById(long id) {
    return this.assigneeRepository.findById(id).orElse(null);
  }

  @Override
  public void saveNewAssignee(Assignee assignee) {
    this.assigneeRepository.save(assignee);
  }
}
