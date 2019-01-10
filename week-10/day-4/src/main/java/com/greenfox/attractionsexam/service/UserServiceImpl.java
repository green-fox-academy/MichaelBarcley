package com.greenfox.attractionsexam.service;

import com.greenfox.attractionsexam.model.User;
import com.greenfox.attractionsexam.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Iterable<User> getAllUser() {
    return this.userRepository.findAll();
  }
}
