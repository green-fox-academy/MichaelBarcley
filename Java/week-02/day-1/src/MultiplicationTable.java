import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        System.out.println("Please give a number.");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
            //System.out.println(i * number);
        }
    }
}
