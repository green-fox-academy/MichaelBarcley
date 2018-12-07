package com.greenfoxacademy.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@Controller
public class WebshopApplication {
  Stock stock;

  public WebshopApplication() {
    stock = new Stock();
  }

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

  @RequestMapping("/")
  public String webshop(Model model) {
    model.addAttribute("items", stock.shopItemsList);
    return "webshop";
  }

  @RequestMapping("/only-available")
  public String onlyavailable(Model model) {
    model.addAttribute("items", stock.shopItemsList
        .stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));
    return "webshop";
  }

  @RequestMapping("/cheapest-first")
  public String cheapestfirst(Model model) {
    model.addAttribute("items", stock.shopItemsList
        .stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));
    return "webshop";
  }

  @RequestMapping("/contains-nike")
  public String containsNike(Model model) {
    model.addAttribute("items", stock.shopItemsList
    .stream()
    .filter(shopItem -> shopItem.getDescription().toLowerCase().contains("nike")
        || shopItem.getName().contains("Nike"))
    .collect(Collectors.toList()));
    return "webshop";
  }

  @RequestMapping("/average-stock")
  public String averageStock(Model model) {
    int itemCounter = 0;
    for (int i = 0; i < stock.shopItemsList.size(); i++) {
      itemCounter += stock.shopItemsList.get(i).getQuantityOfStock();
    }
    int averageStock = itemCounter / stock.shopItemsList.size();
    model.addAttribute("average-stock", averageStock);
    return "average-stock";
  }

  @RequestMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    List<ShopItem> tempItems = stock.shopItemsList
        .stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
        .collect(Collectors.toList());
    model.addAttribute("items", tempItems.get(0));
    return "webshop";
  }
}

