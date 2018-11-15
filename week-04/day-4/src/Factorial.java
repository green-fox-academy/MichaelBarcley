public class Factorial {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial
    System.out.println(factorialCalc(5));
  }

  public static int factorialCalc(int givenNumber) {
    if (givenNumber == 1) {
      return 1;
    } else {
      return givenNumber * factorialCalc(givenNumber - 1);
    }
  }
}
