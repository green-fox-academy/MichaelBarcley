package mypackage;

public class Main {

  public static void main(String[] args) {
    //Exercise Animal
    Animal dog = new Animal(33, 41);
    System.out.println(dog.hunger);
    System.out.println(dog.thirst);

    dog.eat();
    System.out.println(dog.hunger);

    dog.drink();
    System.out.println(dog.thirst);
    
    dog.play();
    System.out.println(dog.thirst);
    System.out.println(dog.hunger);
    System.out.println();

    //Exercise Farm
    Farm veryGoodFarm = new Farm();

    veryGoodFarm.breed(new Animal(11, 14));
    veryGoodFarm.breed(new Animal(7, 24));
    veryGoodFarm.breed(new Animal(30, 3));
    veryGoodFarm.breed(new Animal(9, 11));

    System.out.println(veryGoodFarm.animalsOnFarm());
    veryGoodFarm.slaughter();
    System.out.println(veryGoodFarm.animalsOnFarm());
    System.out.println();
    veryGoodFarm.hungerLevelsOnFarm();
  }
}
