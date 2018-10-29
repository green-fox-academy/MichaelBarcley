import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        //Chickens: 2 legs, Pigs: 4 legs
        System.out.println("Howdy Mr. or Mrs. Farmer!");
        System.out.println("How many chickens you own?");

        Scanner chickenScanner = new Scanner(System.in);
        int chickenLegs = chickenScanner.nextInt();

        System.out.println("How many pigs you own?");

        Scanner pigScanner = new Scanner(System.in);
        int pigLegs = pigScanner.nextInt();

        System.out.println("There are " + (2 * chickenLegs + 4 * pigLegs) + " tippy-tappy legs walking on your farm!");
    }
}