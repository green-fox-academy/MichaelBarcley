import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        System.out.println("Hello! How much lines do you want in your triangle?");

        Scanner triangleScanner = new Scanner(System.in);
        int triangleRows = triangleScanner.nextInt();

        String triangleBlock = "*";

        for (int i = 1; i <= triangleRows; i++) {
            System.out.println(triangleBlock);
            triangleBlock += "*";
        }
    }
}
