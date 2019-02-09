package greenfoxorganization;

public class Sponsor extends Person{
  private String company;
  private int hiredStudents;

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor() {
    this("Jane Doe", 30, "female", "Google");
  }

  public String introduce() {
    return super.introduce() + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far";
  }

  public int hire() {
    return this.hiredStudents++;
  }

  public String getGoal() {
    return "My goal is: Hire brilliant junior software developers";
  }
}
