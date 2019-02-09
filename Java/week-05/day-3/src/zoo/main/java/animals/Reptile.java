package zoo.main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name, int age, String gender, int height, double weight) {
    super(name, age, gender, height, weight);
  }

  public Reptile(String name) {
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

  public String swim() {
    return "This " + this.name + " is swimming.";
  }

  public int getBloodTemperature() {
    return 20 + (int) (Math.random() * 13);
  }
}
