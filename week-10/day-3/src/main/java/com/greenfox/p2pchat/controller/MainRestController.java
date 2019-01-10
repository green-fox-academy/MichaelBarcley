package com.greenfox.p2pchat.controller;

import com.greenfox.p2pchat.model.Message;
import com.greenfox.p2pchat.model.ResponseError;
import com.greenfox.p2pchat.model.ResponseOk;
import com.greenfox.p2pchat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class MainRestController {

  private MessageService messageService;

  @Autowired
  public MainRestController(MessageService messageService) {
    this.messageService = messageService;
  }

  @PostMapping("/message/receive")
  public ResponseEntity<HashMap> receiveMessage(@RequestBody Message message) throws IllegalAccessException {
    if (message.fieldsThatAreNull().equals("timeStamp, ")) {
      message.setTimeStamp(new Date());
      messageService.addMessage(message);
      ResponseOk response = new ResponseOk("ok");
      return new ResponseEntity(response, HttpStatus.OK);
    }
    ResponseError response = new ResponseError("error", "Missing field(s): " + message.fieldsThatAreNull());
    return new ResponseEntity(response, HttpStatus.UNAUTHORIZED);
  }
}
