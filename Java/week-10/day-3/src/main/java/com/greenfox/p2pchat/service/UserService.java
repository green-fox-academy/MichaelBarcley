package com.greenfox.p2pchat.service;

import com.greenfox.p2pchat.model.User;

public interface UserService {
  Long getUserNumber();
  User getMainUser();
  void saveUser(User user);
}
