import java.util.Scanner;

public class DivideByZero {
  // Create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // It should print "fail" if the parameter is 0

  public static void main(String[] args) {
    System.out.println("Please give me a number.");
    Scanner numberScan = new Scanner(System.in);
    int divideByThis = numberScan.nextInt();
    divideTheNumber(divideByThis);
  }

  public static void divideTheNumber(int divider) {
    int mainNumber = 10;
    try {
      int result = mainNumber / divider;
      System.out.println(result);
    } catch (ArithmeticException a) {
      System.out.println("fail");
    }
  }
}
