package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> listOfPlants;

  Garden() {
    listOfPlants = new ArrayList<>();
  }

  public void waterPlants(int waterAmount) {
    int thirstyPlants = 0;
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i).isThirsty()) {
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
}
