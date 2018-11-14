package mypirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> ship;

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

  public int alivePirates() {
    int alivePirates = 0;
    for (int i = 0; i < ship.size(); i++) {
      if (!ship.get(i).isDead) {
        alivePirates++;
      }
    }
    return alivePirates;
  }

  public void getListOfCrew() {
    System.out.println("Status of the captain: " + ship.get(0).status());
    System.out.println("Rums Consumed by the captain: " + ship.get(0).rumsDrank);
    System.out.println("Number of alive pirates on the ship (includes captain): " + alivePirates());
  }

  public int getBattleScore() {
    return (this.alivePirates() - ship.get(0).rumsDrank);
  }

  public void battleWon() {
    for (int i = 0; i < ship.size(); i++) {
      int randomRum = 1 + (int) (Math.random() * 3);
      for (int j = 0; j < randomRum; j++) {
        ship.get(i).drinkSomeRum();
      }
    }
  }

  public void battleLost() {
    int randomDeath = (int) (Math.random() * this.alivePirates());
    int crewSizeAfterDeaths = this.alivePirates() - randomDeath;
    while (this.alivePirates() > crewSizeAfterDeaths) {
      int indexOfPirateKilled = (int) (Math.random() * this.alivePirates());
      ship.remove(indexOfPirateKilled);
    }
  }

  public boolean battle(Ship anotherShip) {
    int scoreShipA = this.getBattleScore();
    int scoreShipB = anotherShip.getBattleScore();
    if(scoreShipA >= scoreShipB) {
      this.battleWon();
      anotherShip.battleLost();
      return true;
    } else {
      this.battleLost();
      anotherShip.battleWon();
      return false;
    }
  }
}
