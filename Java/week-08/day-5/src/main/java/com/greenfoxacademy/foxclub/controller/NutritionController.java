package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class NutritionController {

  private List<String> foods = Arrays.asList("pizza", "mice", "salad", "kakaós csiga");
  private List<String> drinks = Arrays.asList("whiskey", "water", "beer", "orange juice");

  private FoxService foxService;

  @Autowired
  public NutritionController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/nutritionStore")
  public String showNutritionStore(@RequestParam("name") String petName, Model model) {
    Fox fox = foxService.getFoxByName(petName);
    model.addAttribute("fox", fox);
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);

    return "nutrition-store";
  }

  @PostMapping("/nutritionStore")
  public String setFoxNewFoodAndDrink(@RequestParam("name") String petName,
                                      @RequestParam("food") String food,
                                      @RequestParam("drink") String drink,
                                      RedirectAttributes redir) {
    Fox fox = foxService.getFoxByName(petName);
    fox.setFood(food);
    fox.setDrink(drink);
    redir.addAttribute("name", petName);
    return "redirect:/";
  }
}
