import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("General Kenobi! I am General Grievous and let's play a game!");
        System.out.println("I will ask you to give me 5 numbers and I'll calculate the average and sum of them!");

        System.out.println("What is your first number?");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        System.out.println("What is your second number?");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        System.out.println("What is your third number?");
        Scanner scanner3 = new Scanner(System.in);
        int number3 = scanner3.nextInt();

        System.out.println("What is your fourth number?");
        Scanner scanner4 = new Scanner(System.in);
        int number4 = scanner4.nextInt();

        System.out.println("What is your fifth number?");
        Scanner scanner5 = new Scanner(System.in);
        int number5 = scanner5.nextInt();

        System.out.println("You have chosen the following numbers: ");
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);

        int sum = number1 + number2 + number3 + number4 + number5;
        int avg = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("The sum of your chosen number is: " + sum);
        System.out.println("The average of your chosen number are: " + avg);

    }
}
