package comparable;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int compareTo(Domino domino) {
    if (this.getLeftSide() < domino.getLeftSide()) {
      return -1;
    } else if (this.getLeftSide() > domino.getLeftSide()) {
      return 1;
    } else {
      return 0;
      // Order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
    }
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
}

