package com.greenfoxacademy.bankofsimba.service;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
  private List<BankAccount> listOfAccounts;

  public AccountList() {
    listOfAccounts = new ArrayList<>();
    loadAccounts();
  }

  public void loadAccounts() {
    listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
    listOfAccounts.add(new BankAccount("Timon", 1300, "meerkat"));
    listOfAccounts.add(new BankAccount("Pumba", 1650, "warthog"));
    listOfAccounts.add(new BankAccount("Mufasa", 2900.1, "lion"));
    listOfAccounts.add(new BankAccount("Zordon", 600, "lion"));
  }

  public List<BankAccount> getListOfAccounts() {
    return listOfAccounts;
  }
}
