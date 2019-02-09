package mypackage;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student("Joe");
    Teacher teacher1 = new Teacher("Mrs. Waltham");

    teacher1.teach();
    student1.learn();
    System.out.println("");
    student1.question(teacher1);
    teacher1.answer(student1);
  }
}
