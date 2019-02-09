package flyable;

abstract public class Vehicle {
  protected String name;
  protected int maxSpeed;
  protected String color;

  Vehicle(String name, int maxSpeed, String color) {
    this.name = name;
    this.maxSpeed = maxSpeed;
    this.color = color;
  }

  Vehicle() {
    this("Dacia Duster", 185, "White");
  }
}
