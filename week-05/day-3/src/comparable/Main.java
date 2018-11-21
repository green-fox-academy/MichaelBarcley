package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //Domino ordering part
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    System.out.println(dominoes);
    Collections.sort(dominoes);
    // Order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
    System.out.println(dominoes);

    //Thing ordering part
    System.out.println();
    List<Thing> listOfThings = new ArrayList<>();
    listOfThings.add(new Thing("Buy milk", false));
    listOfThings.add(new Thing("Play F1 2018", true));
    listOfThings.add(new Thing("Fill out feedback form", true));
    listOfThings.add(new Thing("Get drunk", false));

    for (Thing item : listOfThings) {
      System.out.println(item.toString());
    }
    Collections.sort(listOfThings);
    System.out.println();
    for (Thing item : listOfThings) {
      System.out.println(item.toString());
    }

  }
}
