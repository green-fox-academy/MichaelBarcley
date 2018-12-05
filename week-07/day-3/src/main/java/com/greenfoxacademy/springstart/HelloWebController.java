package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong id = new AtomicLong();
  private String[] colors = {"red", "blue", "green"};
  private int getColorId = (int) (Math.random() * colors.length);
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public static String gencode() {
    String[] letters = new String[15];
    letters = "0123456789ABCDEF".split("");
    String code = "#";
    for (int i = 0; i < 6; i++) {
      double ind = Math.random() * 15;
      int index = (int) Math.round(ind);
      code += letters[index];
    }
    return code;
  }

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false, defaultValue = " World") String name) {
    int getHelloId = (int) (Math.random() * hellos.length);
    int fontSize = 14 + (int) (Math.random() * 51);
    model.addAttribute("greeting", hellos[getHelloId]);
    model.addAttribute("name", name);
    id.addAndGet(1);
    model.addAttribute("id", id);
    model.addAttribute("size", fontSize);
    model.addAttribute("rgb", gencode());
    return "greeting";
  }
}
