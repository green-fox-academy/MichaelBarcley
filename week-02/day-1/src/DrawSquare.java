import java.util.Collections;
import java.util.Scanner;

public class DrawSquare {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        System.out.println("Hello! How much lines do you want in your square?");

        Scanner squareScanner = new Scanner(System.in);
        int squareRows = squareScanner.nextInt();

        String lego = "%";
        String blank = " ";

        System.out.println(String.join("", Collections.nCopies(6,lego)));
        for (int i = 1; i < squareRows - 1; i++) {
            System.out.print(lego + String.join("", Collections.nCopies(4,blank)) + lego);
            System.out.println();
        }
        System.out.println(String.join("", Collections.nCopies(6,lego)));

    }
}

