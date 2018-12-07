package com.greenfoxacademy.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
    List<ShopItem> availableItems = new ArrayList<>();
    for (ShopItem item: stock.shopItemsList) {
      if (item.getQuantityOfStock() > 0) {
        availableItems.add(item);
      }
    }
    model.addAttribute("items", availableItems);
    return "onlyavailable";
  }

  @RequestMapping("/cheapest-first")
  public String cheapestfirst(Model model) {
    List<ShopItem> cheapestItems = new ArrayList<>();
    List<ShopItem> tempItemList = new ArrayList<>();
    for (ShopItem item: stock.shopItemsList) {
      tempItemList.add(item);
    }

    for (int i = tempItemList.size(); i > 0; i--) {
      int index = 0;
      double price = 99999999;
      for (int j = 0; j < tempItemList.size(); j++) {
        if (price > tempItemList.get(j).getPrice()) {
          price = tempItemList.get(j).getPrice();
          index = j;
        }
      }
      cheapestItems.add(tempItemList.get(index));
      tempItemList.remove(index);
    }
    model.addAttribute("items", cheapestItems);
    return "cheapestfirst";
  }
}

