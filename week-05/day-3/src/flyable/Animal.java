package flyable;

abstract public class Animal {
  protected String name;
  protected int age;
  protected String gender;
  protected int height;
  protected double weight;

  Animal(String name, int age, String gender, int height, double weight) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.height = height;
    this.weight = weight;
  }

  Animal() {
    this("Error! Please set parameters!", 0, "female", 0, 0);
  }

  abstract public String getName();

  abstract public String breed();
}
