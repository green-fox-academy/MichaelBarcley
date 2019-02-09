package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Carrier myCarrier = new Carrier(3000, 5000);
    myCarrier.add(new F16());
    myCarrier.add(new F16());
    myCarrier.add(new F35());
    myCarrier.add(new F35());
    myCarrier.add(new F35());
    myCarrier.fill();
    myCarrier.getStatus();

    Carrier enemyCarrier = new Carrier(2750, 4000);
    enemyCarrier.add(new F16());
    enemyCarrier.add(new F16());
    enemyCarrier.add(new F16());
    enemyCarrier.getStatus();

    myCarrier.aircraftFight(enemyCarrier);
    enemyCarrier.getStatus();
  }
}
