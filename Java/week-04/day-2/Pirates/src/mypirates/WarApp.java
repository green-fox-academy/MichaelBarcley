package mypirates;

public class WarApp {
  public static void main(String... args) {
    Armada goldenFleet = new Armada("The Golden Fleet");
    Armada theCrusaders = new Armada("The Crusaders");

    goldenFleet.fillArmada();
    theCrusaders.fillArmada();

    goldenFleet.war(theCrusaders);
  }
}
