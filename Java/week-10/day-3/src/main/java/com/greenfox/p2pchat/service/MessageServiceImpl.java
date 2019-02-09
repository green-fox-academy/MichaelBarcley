package com.greenfox.p2pchat.service;

import com.greenfox.p2pchat.model.Message;
import com.greenfox.p2pchat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageServiceImpl implements MessageService {

  private MessageRepository messageRepository;

  @Autowired
  public MessageServiceImpl(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  @Override
  public Iterable<Message> getAllMessage() {
    return this.messageRepository.findAll();
  }

  @Override
  public void addMessage(Message message) {
    message.setTimeStamp(new Date());
//    message.setUsername("MichaelBarcley");
    this.messageRepository.save(message);
  }
}
