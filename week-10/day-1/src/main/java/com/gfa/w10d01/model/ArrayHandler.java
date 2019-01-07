package com.gfa.w10d01.model;

public class ArrayHandler {
  private String what;
  private int[] numbers;
  private Object result;

  public ArrayHandler() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public int sum() {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public int multiply() {
    int multiplyResult = 1;
    for (int number: numbers) {
      multiplyResult *= number;
    }
    return multiplyResult;
  }

  public Object doubleNumbers() {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    result = numbers;
    return result;
  }
}
