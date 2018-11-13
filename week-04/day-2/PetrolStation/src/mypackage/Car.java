package mypackage;

public class Car {
  int gasAmount;
  int capacity;

  Car() {
    gasAmount = 0;
    capacity = 100;
  }

  public void getCarGasAmount() {
    System.out.println("The car has currently " + this.gasAmount + " litres of gas.");
  }

  public int drive() {
    return gasAmount--;
  }
}
