public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(numberAdder(5));
  }

  public static int numberAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + numberAdder(n - 1);
    }
  }
}
