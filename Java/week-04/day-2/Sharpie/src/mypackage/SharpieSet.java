package mypackage;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  private List<Sharpie> sharpieSets;

  SharpieSet() {
    this.sharpieSets = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    sharpieSets.add(sharpie);
  }

  public int countSharpies() {
    return sharpieSets.size();
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < sharpieSets.size(); i++) {
      if (sharpieSets.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieSets.size(); i++) {
      if (sharpieSets.get(i).inkAmount == 0) {
        sharpieSets.remove(i);
      }
    }
  }

  public void showColorsOfElements() {
    for (int i = 0; i < sharpieSets.size(); i++) {
      System.out.println(sharpieSets.get(i).color);
    }
  }

}
