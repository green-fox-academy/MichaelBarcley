package com.greenfoxacademy.webshop;

public class ShopItem {
  private String name;
  private String description;
  private long price;
  private int quantityOfStock;

  public ShopItem(String name, String description, long price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }
}
