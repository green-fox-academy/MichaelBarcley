package mypackage;

public class Student {
  String name;

  Student(String name) {
    this.name = name;
  }

  public void learn() {
    System.out.println("---Student is learning---");
  }

  public void question(Teacher teacher) {
    System.out.println("Excuse me " + teacher.name + ", but I don't understand!");
  }
}
