package fibonacci;

public class Fibonacci {
  public int fibonacciNumber(int index) {
    if (index == 0) {
      return 0;
    } else if (index == 1) {
      return 1;
    } else {
      return fibonacciNumber(index - 1) + fibonacciNumber(index - 2);
    }
  }
}
