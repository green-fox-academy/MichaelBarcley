package gardenapplication;

public class Plant {
  protected String plantType;
  protected String color;
  protected int currentWaterLevel;
  protected int criticalWaterLevel;
  protected double absorptionEfficiency;

  Plant(String color, int currentWaterLevel) {
    this.color = color;
    this.currentWaterLevel = currentWaterLevel;
  }

  Plant() {
    this("red", 5);
  }

  public boolean isThirsty() {
    return currentWaterLevel < criticalWaterLevel;
  }
}
