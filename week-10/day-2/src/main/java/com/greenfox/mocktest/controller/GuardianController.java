package com.greenfox.mocktest.controller;

import com.greenfox.mocktest.model.ArrowOfYondu;
import com.greenfox.mocktest.model.ErrorMessage;
import com.greenfox.mocktest.model.GrootTranslater;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<Object> iAmGroot(@RequestParam (required = false) String message) {
    if (message == null) {
      return new ResponseEntity(new ErrorMessage("I am Groot!"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(new GrootTranslater(message), HttpStatus.OK);
  }

  @GetMapping("/yondu")
  public ResponseEntity<Object> myArrowIsAmazing(@RequestParam (required = false) Double distance,
                                                 @RequestParam (required = false) Double time) {
    if (distance != null && time != null) {
      return new ResponseEntity(new ArrowOfYondu(distance, time), HttpStatus.OK);
    }
    return new ResponseEntity(new ErrorMessage("Please make sure you provided" +
        " both a distance and time value!"), HttpStatus.BAD_REQUEST);
  }
}
