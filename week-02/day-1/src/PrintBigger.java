import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Hello, please give a number.");

        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        System.out.println("Please give me a second number.");

        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        if (number1 > number2) {
            System.out.println("The bigger number of these two numbers is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The bigger number of these two numbers is: " + number2);
        }
    }
}
