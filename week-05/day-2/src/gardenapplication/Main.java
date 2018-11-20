package gardenapplication;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    myGarden.addPlant(new Flower("yellow", 5));
    myGarden.addPlant(new Flower("blue", 12));
    myGarden.addPlant(new Tree("purple", 15));
    myGarden.addPlant(new Tree("orange", 11));
    for (Plant plant : myGarden.listOfPlants) {
      System.out.println(plant.currentWaterLevel);
    }
  }
}
