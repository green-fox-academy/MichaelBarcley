package greenfoxorganization;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    this("Jane Doe", 30, "female", "The School of Life");
  }

  public String getGoal() {
    return "My goal is: Be a junior software developer";
  }

  public String introduce() {
    return super.introduce() + " who skipped " + this.skippedDays + " days from the course already";
  }

  public int skipDays(int days) {
    return this.skippedDays += days;
  }
}
