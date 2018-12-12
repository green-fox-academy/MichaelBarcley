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
  }

  public List<BankAccount> getListOfAccounts() {
    return listOfAccounts;
  }
}
