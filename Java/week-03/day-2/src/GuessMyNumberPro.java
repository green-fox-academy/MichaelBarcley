import java.util.Scanner;

public class GuessMyNumberPro {
    public static void main(String... args) {
        System.out.println("Welcome to the Number guesser game!");
        System.out.println("I will think of a number. Can you guess it?");
        System.out.println("But beware! You have only have 5 guesses, otherwise I win!");

        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        while (minNumber >= maxNumber) {
            System.out.println("\nWhat is the minimum number I can think of?");
            minNumber = scanner.nextInt();

            System.out.println("\nWhat is the maximum number I can think of?");
            maxNumber = scanner.nextInt();
            if (minNumber >= maxNumber) {
                System.out.println("Minimum number is higher than the maximum number.");
                System.out.println("Please give a higher number for the maximum than the minimum number.");
            }
        }

        System.out.println("Systems initiated... Number on the specified interval is ready.");
        System.out.println("Let the game begin! What's your first guess?");

        int myRandomNumber = (int) (minNumber + Math.random() * (maxNumber - 1));
        int lives = 5;
        System.out.println(myRandomNumber);

        int guess = scanner.nextInt();

        while (guess != myRandomNumber && lives > 1) {
            if (guess < myRandomNumber) {
                System.out.println("The stored number is higher! Guess again!");
                lives--;
                System.out.println("You have " + lives + " lives remaining...");
                guess = scanner.nextInt();
            } else if (guess > myRandomNumber) {
                System.out.println("The stored number is lower! Guess again!");
                lives--;
                System.out.println("You have " + lives + " lives remaining...");
                guess = scanner.nextInt();
            }
        }
        if (lives <= 1) {
            System.out.println("You have no more lives left!");
            System.out.println("You have lost!");
            System.out.println("The number was: " + myRandomNumber + ".");
        }

        if (guess == myRandomNumber) {
            System.out.println("You found the number: " + myRandomNumber + "!");
            System.out.println("Congratulations! You win!");
        }
    }
}
