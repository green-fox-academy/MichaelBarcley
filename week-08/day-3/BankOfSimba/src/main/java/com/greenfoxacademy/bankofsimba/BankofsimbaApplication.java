package com.greenfoxacademy.bankofsimba;

import com.greenfoxacademy.bankofsimba.service.AccountList;
import com.greenfoxacademy.bankofsimba.service.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankofsimbaApplication {
  public static BankAccount testAccount = new BankAccount("Test", 0, "...whatever", true);
  public static AccountList allAccounts = new AccountList();

  public static void main(String[] args) {
    SpringApplication.run(BankofsimbaApplication.class, args);
  }
}
