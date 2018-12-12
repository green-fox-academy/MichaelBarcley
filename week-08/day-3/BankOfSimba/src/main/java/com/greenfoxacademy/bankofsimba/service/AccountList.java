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
    listOfAccounts.add(new BankAccount("Simba", 2000, "Lion", true));
    listOfAccounts.add(new BankAccount("Timon", 1300, "Meerkat", true));
    listOfAccounts.add(new BankAccount("Pumba", 1650, "Warthog", true));
    listOfAccounts.add(new BankAccount("Mufasa", 2900.1, "Lion", false));
    listOfAccounts.add(new BankAccount("Zordon", 19600, "Lion", false));
    listOfAccounts.get(4).setKing(true);
  }

  public List<BankAccount> getListOfAccounts() {
    return listOfAccounts;
  }

  public void addAccount(BankAccount account) {
    listOfAccounts.add(account);
  }
}
