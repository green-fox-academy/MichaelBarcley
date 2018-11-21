package cloneable;

public class Student extends Person {
  protected String previousOrganization;
  protected int skippedDays;

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

  public Student clone() {
    return new Student(this.name, this.age, this.gender, this.previousOrganization);
  }
}
