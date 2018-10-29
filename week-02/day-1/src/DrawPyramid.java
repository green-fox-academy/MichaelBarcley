import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        System.out.println("Hello! How much lines do you want in your pyramid?");

        Scanner pyramidScanner = new Scanner(System.in);
        int pyramidRows = pyramidScanner.nextInt();

        String pyramidBlock = "*";

            for(int i = 1; i <= pyramidRows; i++) {
                for(int j = 1; j <= pyramidRows - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= (i * 2) - 1; k++) {
                    System.out.print(pyramidBlock);
                }
                System.out.println("");
            }
        }
    }

