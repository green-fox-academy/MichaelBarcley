package zoo.main.java.animals;

public class Bird extends Animal {
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

  public String fly() {
    return "This " + this.name + " is flying.";
  }

  public int getCurrentFlightHeight() {
    return (int) (Math.random() * 101);
  }
}
