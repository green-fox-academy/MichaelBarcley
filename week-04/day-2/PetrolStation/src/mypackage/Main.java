package mypackage;

public class Main {

  public static void main(String[] args) {
    Car renaultMegane = new Car();
    Station shellPetrolStation = new Station(3000);

    renaultMegane.getCarGasAmount();
    shellPetrolStation.getStationGasAmount();

    shellPetrolStation.refill(renaultMegane);

    renaultMegane.getCarGasAmount();
    shellPetrolStation.getStationGasAmount();

    renaultMegane.drive();
    renaultMegane.getCarGasAmount();
  }
}
