package com.greenfoxacademy.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class WebshopApplication {
  List<ShopItem> shopItemsList;

  public WebshopApplication() {
    shopItemsList = new ArrayList<>();
    shopItemsList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    shopItemsList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    shopItemsList.add(new ShopItem("Coca Cola", "0.5l standard coke", 25.0, 0));
    shopItemsList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    shopItemsList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

  @RequestMapping("/")
  public String webshop(Model model) {
    model.addAttribute("items", shopItemsList);
    return "webshop";
  }
}

