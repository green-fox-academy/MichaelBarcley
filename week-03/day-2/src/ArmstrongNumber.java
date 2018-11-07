import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String... args) {
        System.out.println("Please give a number.");

        Scanner scanner = new Scanner(System.in);
        String armstrong = scanner.nextLine();

        char[] numbersInChars = armstrong.toCharArray();
        int[] numbersInInts = new int[numbersInChars.length];

        for (int i = 0; i < numbersInChars.length; i++) {
            numbersInInts[i] = Character.getNumericValue(numbersInChars[i]);
        }

        int checkArmstrong = 0;
        for (int i = 0; i < numbersInInts.length; i++) {
            checkArmstrong += (int) (Math.pow((double) numbersInInts[i], (double) (numbersInInts.length)));
        }

        if (checkArmstrong == Integer.parseInt(armstrong)) {
            System.out.println("The given number is an Armstrong Number.");
            System.out.println(armstrong + " = " + checkArmstrong);
        } else {
            System.out.println("The given number is NOT an Armstrong Number.");
            System.out.println(armstrong + " != " + checkArmstrong);
        }

    }
}
