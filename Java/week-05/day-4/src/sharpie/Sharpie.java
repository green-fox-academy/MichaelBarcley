package sharpie;

public class Sharpie {
  String color;
  double width;
  double inkAmount;

  Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public double use() {
    return inkAmount--;
  }
}
