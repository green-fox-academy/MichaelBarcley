package sum;

import java.util.ArrayList;

public class Sum {
  public Sum () {
  }

  public int getArrayListSum(ArrayList<Integer> listOfNumbers) {
    int sum = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      sum += listOfNumbers.get(i);
    }
    return sum;
  }
}
