package greenfoxorganization;

public class Mentor extends Person {
  private String level;

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }

  public String introduce() {
    return super.introduce() + " " + this.level + " mentor";
  }
}
