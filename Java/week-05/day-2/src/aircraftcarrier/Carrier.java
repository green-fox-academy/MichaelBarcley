package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircraftCarrier;
  int storedAmmo;
  int health;

  Carrier(int storedAmmo, int health) {
    aircraftCarrier = new ArrayList<>();
    this.storedAmmo = storedAmmo;
    this.health = health;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void add(Aircraft aircraft) {
    aircraftCarrier.add(aircraft);
  }

  public void fill() {
    try {
      if (this.storedAmmo == 0) {
        throw new Exception();
      } else {
        for (Aircraft myAircraft : aircraftCarrier) {
          this.storedAmmo = this.storedAmmo + myAircraft.getCurrentAmmo() - myAircraft.getMaxAmmo();
          myAircraft.refill(this.storedAmmo);
        }
      }
    } catch (Exception e) {
      System.out.println("Insufficient ammo on the ship!");

    }
  }

  public int calculateDamageOfCarrier() {
    int allDamage = 0;
    for (Aircraft allAircraft : aircraftCarrier
    ) {
      allDamage += allAircraft.getBaseDamage() * allAircraft.getCurrentAmmo();
    }
    return allDamage;
  }

  public void aircraftFight(Carrier anotherCarrier) {
    anotherCarrier.setHealth(anotherCarrier.getHealth() - this.calculateDamageOfCarrier());
    for (Aircraft battleAircraft : this.aircraftCarrier) {
      battleAircraft.setCurrentAmmo(0);
    }
  }

  public void getStatus() {
    System.out.println("\nHP: " + this.getHealth() + ", Aircraft count: " + this.aircraftCarrier.size()
        + ", Ammo storage: " + this.storedAmmo + ", Total damage: " + this.calculateDamageOfCarrier());
    System.out.println("Aircrafts:");
    for (Aircraft aircraftList : this.aircraftCarrier) {
      System.out.println(aircraftList.getStatus());
    }
  }
}
