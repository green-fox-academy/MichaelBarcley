package com.gfa.w10d01.model;

public class DoUntil {
  private int result;

  public DoUntil() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sumOfNumber(int number) {
    if (number == 0) {
      return 0;
    } else {
      number = number + sumOfNumber(number - 1);
    }
    return number;
  }

  public int factorialOfNumber(int number) {
    if (number == 0) {
      return 1;
    } else {
      number = number * factorialOfNumber(number - 1);
    }
    return number;
  }

  public void sum(Until until) {
    this.result = sumOfNumber(until.getUntil());
  }

  public void factorial(Until until) {
    this.result = factorialOfNumber(until.getUntil());
  }
}
