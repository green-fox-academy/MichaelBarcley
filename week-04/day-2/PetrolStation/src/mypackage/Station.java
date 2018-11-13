package mypackage;

public class Station {
  int gasAmount;

  Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void getStationGasAmount() {
    System.out.println("The station has currently " + this.gasAmount + " litres of gas left to sell.");
  }

  public int refill(Car car) {
    int litersFilled = car.capacity - car.gasAmount;
    car.gasAmount = car.capacity;
    this.gasAmount = this.gasAmount - litersFilled;
    return this.gasAmount;
  }
}
