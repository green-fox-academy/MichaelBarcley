import java.util.Collections;
import java.util.Scanner;

public class DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        System.out.println("Hello! How much lines do you want in your square?");

        Scanner diagonalScanner = new Scanner(System.in);
        int diagonalRows = diagonalScanner.nextInt();

        String lego = "%";
        String blank = " ";

        System.out.println(String.join("", Collections.nCopies(diagonalRows, lego)));
        for (int i = 1; i < diagonalRows -1 ; i++) {
            for (int j = 1; j <= diagonalRows; j++)
                if (i == j - 1 || j == 1 || j == diagonalRows) {
                    System.out.print(lego);
                } else {
                    System.out.print(blank);
                }
            System.out.println("");
        }
        System.out.println(String.join("", Collections.nCopies(diagonalRows, lego)));
    }
}
