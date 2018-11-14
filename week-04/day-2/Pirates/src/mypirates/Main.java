package mypirates;

public class Main {

  public static void main(String[] args) {
    //Testing Pirate class
    Pirate testPirate = new Pirate();
    Pirate testPirate2 = new Pirate();
    Pirate testPirate3 = new Pirate();

    testPirate.howItGoingMate();
    testPirate.giveParrot();
    testPirate.hasParrot();
    for (int i = 0; i < 5; i++) {
      testPirate.drinkSomeRum();
    }
    testPirate.howItGoingMate();
    testPirate.die();
    testPirate.drinkSomeRum();
    testPirate.howItGoingMate();
    System.out.println(); //Blank line for better readability when program is running
    testPirate2.brawl(testPirate3);
    testPirate2.howItGoingMate();
    testPirate3.howItGoingMate();
    System.out.println(); //Blank line for better readability when program is running

    //Testing Ship class
    Ship blackPearl = new Ship();
    blackPearl.fillShip();
    blackPearl.getListOfCrew();

    Ship theJuggernaut = new Ship();
    theJuggernaut.fillShip();
    theJuggernaut.getListOfCrew();

    blackPearl.battle(theJuggernaut);
    System.out.println("\nAfter the battle:");
    blackPearl.getListOfCrew(); //After battle ship status
    theJuggernaut.getListOfCrew();
  }
}
