package cloneable;

public class Main {
  public static void main(String[] args) {
    Student john = new Student("John", 20, "male", "BME");
    System.out.println(john.introduce());
    System.out.println(john);

    Student johnClone = john.clone();
    System.out.println(johnClone.introduce());
    System.out.println(johnClone);
  }
}
