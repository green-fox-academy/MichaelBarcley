package mypirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> ship;

  Ship() {
    ship = new ArrayList<>();
  }

  public void fillShip() {
    int numberOfPirates = 1 + (int) (Math.random() * 30);

    ship.add(new Pirate(true));
    for (int i = 1; i < numberOfPirates; i++) {
      ship.add(new Pirate());
    }
  }

  public void getListOfCrew() {
    for (int i = 0; i < ship.size(); i++) {
      System.out.println("Status of the captain:");
    }
  }
}
