package mypirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  private List<Ship> armada;
  String armadaName;

  Armada(String armadaName) {
    armada = new ArrayList<>();
    this.armadaName = armadaName;
  }

  public void fillArmada() {
    int shipsToAdd = 1 + ((int) (Math.random() * 50));
    for (int i = 1; i <= shipsToAdd; i++) {
      Ship tempShip = new Ship();
      tempShip.fillShip();
      armada.add(tempShip);
    }
  }

  public int size() {
    return armada.size();
  }

  public Ship remove(int index) {
    return armada.remove(index);
  }

  public Ship getShip(int index) {
    return armada.get(index);
  }

  public int getShipScore(int index) {
    return this.getShip(index).getBattleScore();
  }

  public boolean war(Armada anotherArmada) {
    int armadaAcurrent = 1; //Needed to log the match-ups easily.
    int armadaBcurrent = 1;
    while (this.size() != 0 &&  anotherArmada.size() != 0) {
      int currentShipStrArmadaA = this.getShipScore(0);
      int currentShipStrArmadaB = anotherArmada.getShipScore(0);

      System.out.println("\nCurrent battle: Ship " + armadaAcurrent + " from " + this.armadaName + " vs. Ship " +
          armadaBcurrent + " from " + anotherArmada.armadaName);
      System.out.println("Strength of current ship from " + this.armadaName + " is " + currentShipStrArmadaA +
          " while strength of current ship from " + anotherArmada.armadaName + " is " + currentShipStrArmadaB);

      if (this.getShipScore(0) >= anotherArmada.getShipScore(0)) {
        this.getShip(0).battleWon();
        anotherArmada.remove(0);
        armadaBcurrent++;
        System.out.println("The ship from " + this.armadaName + " defeated the ship from " +
            anotherArmada.armadaName + "!");
      } else {
        anotherArmada.getShip(0).battleWon();
        armada.remove(0);
        armadaAcurrent++;
        System.out.println("The ship from " + anotherArmada.armadaName + " defeated the ship from " +
            this.armadaName + "!");
      }
    }
    if (this.size() > 0) {
      System.out.println("\n" + this.armadaName + " has won!");
      return true;
    } else {
      System.out.println("\n" + anotherArmada.armadaName + " has won!");
      return false;
    }
  }
}
