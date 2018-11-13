package mypackage;

public class Animal {
  int hunger;
  int thirst;

  Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public int eat() {
    return hunger--;
  }

  public int drink() {
    return thirst--;
  }

  public void play() {
    this.hunger--;
    this.thirst--;
  }
}
