package cloneable;

public class Person {
  protected String name;
  protected int age;
  protected String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    this("Jane Doe", 30, "female");
  }

  public String introduce() {
    return "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender;
  }

  public String getGoal() {
    return "My goal is: Live for the moment";
  }
}
