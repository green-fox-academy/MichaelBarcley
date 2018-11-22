package fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  @Test
  public void testFibonacciNumber_index3() {
    Fibonacci test = new Fibonacci();
    assertEquals(2, test.fibonacciNumber(3));
  }

  @Test
  public void testFibonacciNumber_index0() {
    Fibonacci test = new Fibonacci();
    assertEquals(0, test.fibonacciNumber(0));
  }

  @Test(expected = AssertionError.class)
  public void testFibonacciNumber_indexNull() {
    Fibonacci test = new Fibonacci();
    assertEquals(null, test.fibonacciNumber(0));
  }

  @Test(expected = StackOverflowError.class)
  public void testFibonacciNumber_indexNegative() {
    Fibonacci test = new Fibonacci();
    assertEquals(0, test.fibonacciNumber(-4));
  }
}
