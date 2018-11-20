package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> listOfPlants;

  Garden() {
    listOfPlants = new ArrayList<>();
  }

  public void waterPlants(int waterAmount) {
    System.out.println("\nWatering with " + waterAmount);
    int thirstyPlants = 0;
    for (Plant plant : listOfPlants) {
      if (plant.currentWaterLevel < plant.criticalWaterLevel) {
        thirstyPlants++;
      }
    }
    int waterToEachPlant = waterAmount / thirstyPlants;

    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i).isThirsty()) {
        listOfPlants.get(i).currentWaterLevel += (waterToEachPlant * listOfPlants.get(i).absorptionEfficiency);
      }
    }
  }

  public void addPlant(Plant plant) {
    listOfPlants.add(plant);
  }

  public void getStatusOfAll() {
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i).isThirsty()) {
        System.out.println("The " + listOfPlants.get(i).color + " " + listOfPlants.get(i).plantType + " needs water!");
      } else {
        System.out.println("The " + listOfPlants.get(i).color + " " + listOfPlants.get(i).plantType + " Plant doesn't need water!");
      }
    }
  }
}
