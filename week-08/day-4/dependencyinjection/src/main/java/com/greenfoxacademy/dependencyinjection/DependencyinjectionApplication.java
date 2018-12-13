package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.service.MyColor;
import com.greenfoxacademy.dependencyinjection.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {

  @Autowired
  //@Qualifier("Red")
  //Printer myPrinter;
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionApplication.class, args);
    //System.exit(0);
  }

  @Override
  public void run(String... args) throws Exception {
    //myPrinter.log("Hello boooi");
    color.printColor();
  }
}

