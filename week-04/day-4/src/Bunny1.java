public class Bunny1 {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(bunnyEars(16));
  }

  public static int bunnyEars(int bunnies) {
    if (bunnies == 1) {
      return 2;
    } else {
      return 2 + bunnyEars(bunnies - 1);
    }
  }
}
