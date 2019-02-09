package zoo.main.java.animals;

public class Mammal extends Animal {
  public Mammal(String name, int age, String gender, int height, double weight) {
    super(name, age, gender, height, weight);
  }

  public Mammal(String name) {
    this(name, 3, "male", 72, 30);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  public String play() {
    return "This " + this.name + " is playing.";
  }

  public String run() {
    return "This " + this.name + " is running.";
  }
}
