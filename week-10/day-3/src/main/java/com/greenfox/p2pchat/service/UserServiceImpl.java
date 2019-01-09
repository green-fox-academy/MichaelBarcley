package com.greenfox.p2pchat.service;

import com.greenfox.p2pchat.model.Message;
import com.greenfox.p2pchat.model.User;
import com.greenfox.p2pchat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Long getUserNumber() {
    return this.userRepository.count();
  }
}
