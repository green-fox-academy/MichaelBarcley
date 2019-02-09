package flyable;

public class Helicopter extends Vehicle implements Flyable {
  Helicopter(String name, int maxSpeed, String color) {
    super(name, maxSpeed, color);
  }

  @Override
  public void land() {
    System.out.println("The helicopter has successfully landed!");
  }

  @Override
  public void fly() {
    System.out.println("The helicopter is flying...");
  }

  @Override
  public void takeOff() {
    System.out.println("The helicopter is taking off.");
  }
}
