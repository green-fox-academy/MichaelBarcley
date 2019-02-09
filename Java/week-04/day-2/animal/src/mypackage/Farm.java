package mypackage;

import java.util.ArrayList;

public class Farm {
  private ArrayList<Animal> farm;

  Farm() {
    farm = new ArrayList<>();
  }

  public static int placesforAnimals = 50;
  public int animalsOnFarm() {
    return this.farm.size();
  }

  public void breed(Animal animal) {
    if(farm.size() < placesforAnimals) {
      farm.add(animal);
    } else {
      System.out.println("The farm is full! Can't breed more animals!");
    }
  }

  public void slaughter() {
    int hungerOfLeastHungryAnimal = 0;
    int indexOfLeastHungryAnimal = 0;
    for (int i = 0; i < farm.size(); i++) {
      if(farm.get(i).hunger > hungerOfLeastHungryAnimal) {
        hungerOfLeastHungryAnimal = farm.get(i).hunger;
        indexOfLeastHungryAnimal = i;
      }
    }
    farm.remove(indexOfLeastHungryAnimal);
  }

  public void hungerLevelsOnFarm() {
    for (int i = 0; i < farm.size(); i++) {
      System.out.println(farm.get(i).hunger);
    }
  }
}
