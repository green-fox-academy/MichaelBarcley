package com.greenfoxacademy.webshop;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  List<ShopItem> shopItemsList;

  public Stock() {
    shopItemsList = new ArrayList<>();
    shopItemsList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    shopItemsList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    shopItemsList.add(new ShopItem("Coca Cola", "0.5l standard coke", 25.0, 0));
    shopItemsList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    shopItemsList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }
}
