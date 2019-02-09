package com.greenfox.attractionsexam.repository;

import com.greenfox.attractionsexam.model.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {
  Attraction findTopByCategoryOrderByPrice(String category);
}
