package gardenapplication;

public class Tree extends Plant {
  Tree(String color, int currentWaterLevel) {
    super(color, currentWaterLevel);
    this.plantType = "Tree";
    this.absorptionEfficiency = 0.4;
    this.criticalWaterLevel = 10;
  }

  Tree() {
    this("green", 5);
  }
}
