package com.greenfox.attractionsexam.service;

import com.greenfox.attractionsexam.model.Attraction;
import com.greenfox.attractionsexam.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttractionServiceImpl implements AttractionService {

  private AttractionRepository attractionRepository;

  @Autowired
  public AttractionServiceImpl(AttractionRepository attractionRepository) {
    this.attractionRepository = attractionRepository;
  }

  @Override
  public void addItem(Attraction attraction) {
    this.attractionRepository.save(attraction);
  }

  @Override
  public Iterable<Attraction> getAllItem() {
    return this.attractionRepository.findAll();
  }

  @Override
  public Attraction getAttractionById(long id) {
    return this.attractionRepository.findById(id).orElse(null);
  }

  @Override
  public void editItem(long id) {
    Attraction editedItem = this.attractionRepository.findById(id).orElse(null);
    editedItem.setId(id);
    this.attractionRepository.save(editedItem);
  }

  @Override
  public Attraction findTopInCategory(String category) {
    return this.attractionRepository.findTopByCategoryOrderByPrice(category);
  }
}
