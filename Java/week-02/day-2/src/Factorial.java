import java.util.Scanner;

public class Factorial {
    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static void main(String[] args) {
        System.out.println("Please give me a number.");
        System.out.println("The factorio of your given number is: " + factorio(numScanner()));

    }

    public static int factorio(int limitNumber) {
        int faktorialis = 1;
        for (int i = 1; i <= limitNumber; i++) {
            faktorialis *= i;
        }
        return faktorialis;
    }

    public static int numScanner() {
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        return givenNum;
    }
}