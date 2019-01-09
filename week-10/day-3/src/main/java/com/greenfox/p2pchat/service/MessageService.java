package com.greenfox.p2pchat.service;

import com.greenfox.p2pchat.model.Message;

import java.util.List;

public interface MessageService {
  Iterable<Message> getAllMessage();
  void addMessage(Message message);
}
