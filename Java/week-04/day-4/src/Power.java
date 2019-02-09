public class Power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    System.out.println(powerItUp(2, 10));
  }

  public static int powerItUp(int base, int power) {
    if (power == 0) {
      return 1;
    } else {
      return base * (powerItUp(base, power - 1));
    }
  }
}
