package mypackage;

public class Animal {
  int hunger;
  int thirst;

  Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
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
