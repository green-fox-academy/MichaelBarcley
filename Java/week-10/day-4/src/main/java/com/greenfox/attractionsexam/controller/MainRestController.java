package com.greenfox.attractionsexam.controller;

import com.greenfox.attractionsexam.model.Attraction;
import com.greenfox.attractionsexam.model.AttractionDto;
import com.greenfox.attractionsexam.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainRestController {

  private AttractionService attractionService;

  @Autowired
  public MainRestController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/budge")
  public List<AttractionDto> budge() {
    List<AttractionDto> cheapestPlaces = new ArrayList<>();
    cheapestPlaces.add(this.attractionService.findTopInCategory("Restaurant").convertIntoDto());
    cheapestPlaces.add(this.attractionService.findTopInCategory("Park").convertIntoDto());
    cheapestPlaces.add(this.attractionService.findTopInCategory("Museum").convertIntoDto());
    return cheapestPlaces;
  }
}
