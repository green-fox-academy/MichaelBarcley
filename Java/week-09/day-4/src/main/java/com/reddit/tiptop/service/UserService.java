package com.reddit.tiptop.service;

import com.reddit.tiptop.repository.User;

public interface UserService {

  User getUserById(long id);
  void addUser(User user);

}
