package com.greenfox.attractionsexam.model;

import javax.persistence.*;

@Entity
public class Attraction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String city;
  private int price;
  private double longitude;
  private double latitude;
  private String category;
  private int duration;
  private int recommendedAge;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "submitter")
  private User user;

  public Attraction() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(int recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public AttractionDto convertIntoDto() {
    return new AttractionDto(this.id, this.name, this.city,
        this.price, this.longitude, this.latitude,
        this.category, this.duration, this.recommendedAge);
  }
}
