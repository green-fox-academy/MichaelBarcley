package com.greenfox.attractionsexam.service;

import com.greenfox.attractionsexam.model.Attraction;

import java.util.List;

public interface AttractionService {
  void addItem(Attraction attraction);
  Iterable<Attraction> getAllItem();
  Attraction getAttractionById(long id);
  void editItem(long id);
  Attraction findTopInCategory(String category);

}
