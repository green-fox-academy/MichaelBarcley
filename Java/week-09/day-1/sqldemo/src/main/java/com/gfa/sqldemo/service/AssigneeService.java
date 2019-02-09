package com.gfa.sqldemo.service;

import com.gfa.sqldemo.model.Assignee;

import java.util.List;

public interface AssigneeService {

  public List<Assignee> getAllAssignee();
  public Assignee getAssigneeById(long id);
  public void saveNewAssignee(Assignee assignee);
}
