package com.reddit.tiptop.service;

import com.reddit.tiptop.repository.User;
import com.reddit.tiptop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  UserRepository users;

  @Autowired
  UserServiceImpl(UserRepository users) {
    this.users = users;
  }

  @Override
  public User getUserById(long id) {
    return null;
  }

  @Override
  public void addUser(User user) {

  }
}
