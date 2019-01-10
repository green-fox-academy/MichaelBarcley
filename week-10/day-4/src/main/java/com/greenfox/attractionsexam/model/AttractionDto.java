package com.greenfox.attractionsexam.model;

import java.util.List;

public class AttractionDto {
  private List<Attraction> attractions;

  public AttractionDto() {
  }

  public List<Attraction> getAttractions() {
    return attractions;
  }

  public void setAttractions(List<Attraction> attractions) {
    this.attractions = attractions;
  }
}
