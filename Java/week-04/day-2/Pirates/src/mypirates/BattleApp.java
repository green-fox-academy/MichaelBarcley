package mypirates;

public class BattleApp {
  public static void main(String... args) {
    Ship blackPearl = new Ship();
    blackPearl.fillShip();
    blackPearl.getListOfCrew();

    Ship theJuggernaut = new Ship();
    theJuggernaut.fillShip();
    theJuggernaut.getListOfCrew();

    blackPearl.battle(theJuggernaut);
    System.out.println("\nAfter the battle:\n");
    blackPearl.getListOfCrew();
    theJuggernaut.getListOfCrew();
  }
}
