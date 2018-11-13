package mypackage;

public class Sharpie {
  String color;
  float width;
  float inkAmount;

  Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public float use() {
    return inkAmount--;
  }
}
