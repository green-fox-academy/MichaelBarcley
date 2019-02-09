import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        //1 mile is 1.609344 kilometer
        double converter = 1 / 1.609344;
        System.out.println("How many kms you have travelled?");

        Scanner kmScanner = new Scanner(System.in);
        int kilometer = kmScanner.nextInt();
        double mile = kilometer * converter;
        System.out.println("That is " + mile + " miles!");
    }
}