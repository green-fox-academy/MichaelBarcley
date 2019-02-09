package mypackage;

public class Counter {
  int number;
  int initialNumber;

  Counter(int number) {
    this.number = number;
    this.initialNumber = number;
  }

  Counter() {
    this(0);
  }

  public int add(int addNumber) {
    this.number += addNumber;
    return this.number;
  }

  public int add() {
    return this.number++;
  }

  public int get() {
    return this.number;
  }

  public int reset() {
    this.number = this.initialNumber;
    return this.number;

  }
}
