package mypackage;

public class Main {

  public static void main(String[] args) {
    Animal dog = new Animal();
    System.out.println(dog.hunger);
    System.out.println(dog.thirst);

    dog.eat();
    System.out.println(dog.hunger);

    dog.drink();
    System.out.println(dog.thirst);
    
    dog.play();
    System.out.println(dog.thirst);
    System.out.println(dog.hunger);
  }
}
