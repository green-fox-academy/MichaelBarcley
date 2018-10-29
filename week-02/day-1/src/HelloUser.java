import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Please enter your name:");

        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();

        System.out.println("Greetings mighty " + name + "!");
    }
}