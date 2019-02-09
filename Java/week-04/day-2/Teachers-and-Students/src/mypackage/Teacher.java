package mypackage;

public class Teacher {
  String name;

  Teacher(String name) {
    this.name = name;
  }

  public void teach() {
    System.out.println("Sooo... The square of number 4 is...");
  }

  public void answer(Student student) {
    System.out.println("Oh! Okay, then I repeat it " + student.name + ".");
  }
}
