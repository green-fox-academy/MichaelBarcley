package flyable;

public class Bird extends Animal implements Flyable {
  public Bird(String name, int age, String gender, int height, double weight) {
    super(name, age, gender, height, weight);
  }

  public Bird(String name) {
    this(name, 3, "male", 72, 30);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void land() {
    System.out.println("The " + this.name + " is currently landing.");
  }

  public void fly() {
    System.out.println("This " + this.name + " is flying.");
  }

  @Override
  public void takeOff() {
    System.out.println("The " + this.name + " is taking off from the ground!");
  }

  public int getCurrentFlightHeight() {
    return (int) (Math.random() * 101);
  }
}
