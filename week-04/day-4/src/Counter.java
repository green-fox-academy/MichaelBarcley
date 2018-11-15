public class Counter {
  public static void main(String... args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    recursiveCounter(8);
  }

  public static int recursiveCounter(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return recursiveCounter(n - 1);
    }
  }
}
