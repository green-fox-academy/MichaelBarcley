import java.util.Scanner;

public class Summing {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main(String[] args) {
        System.out.println("Please give me a number.");
        System.out.println("The sum from 1 to your given number is: " + sum(numScanner()));
    }

    public static int sum(int limit) {
        int osszeg = 0;
        for(int i = 1; i <= limit; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    public static int numScanner() {
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        return givenNum;
    }
}
