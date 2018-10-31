import java.util.Scanner;


public class GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    public static void main(String[] args) {
        int questionNumber = 8;

        System.out.println("Hey! I thought of a number. Can you guess it?");

        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while (guess != questionNumber) {
            if (guess < 8) {
                System.out.println("The stored number is higher! Guess again!");
                guess = scanner.nextInt();
            } else if (guess > 8) {
                System.out.println("The stored number is lower! Guess again!");
                guess = scanner.nextInt();
            }
        }
        if (guess == 8) {
            System.out.println("You found the number: " + questionNumber + "!");
        }
    }
}
