import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        System.out.println("How many numbers will you type in?");
        Scanner howManyNumbers = new Scanner(System.in);
        int howManyTimes = howManyNumbers.nextInt();
        System.out.println("Thank you.");

        Scanner numberHolder = new Scanner(System.in);
        int sumBodyOnceToldMe = 0;

        for (int i = 1; i <= howManyTimes ; i++) {
            System.out.println("Print in the next number.");
            int temp = numberHolder.nextInt();
            sumBodyOnceToldMe += temp;
        }

        double average = (double)sumBodyOnceToldMe / howManyTimes;
        System.out.println("You have input " + howManyTimes + " numbers.");
        System.out.println("The sum of these numbers is " + sumBodyOnceToldMe + ".");
        System.out.println("The average of these numbers is " + average + ".");
    }
}
