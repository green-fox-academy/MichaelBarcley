package gardenapplication;

public class Flower extends Plant {
  Flower(String color, int currentWaterLevel) {
    super(color, currentWaterLevel);
    this.absorptionEfficiency = 0.75;
    this.criticalWaterLevel = 5;
  }

  Flower() {
    this("red", 5);
  }
}
