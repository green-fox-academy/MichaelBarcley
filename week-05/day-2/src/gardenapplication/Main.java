package gardenapplication;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    myGarden.addPlant(new Flower("yellow", 0));
    myGarden.addPlant(new Flower("blue", 0));
    myGarden.addPlant(new Tree("purple", 0));
    myGarden.addPlant(new Tree("orange", 0));

    myGarden.getStatusOfAll();

    myGarden.waterPlants(40);
    myGarden.getStatusOfAll();

    myGarden.waterPlants(70);
    myGarden.getStatusOfAll();
  }
}
