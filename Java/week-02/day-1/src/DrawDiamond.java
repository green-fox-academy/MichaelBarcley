import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        //Kiírom a minta alakzatot sima sout-tal, hogy lássam mennyi space és csillag van
        System.out.println("   *"); //3 space, 1 csillag
        System.out.println("  ***"); //2 space, 3 csillag
        System.out.println(" *****"); //1 space, 5 csillag
        System.out.println("*******"); //7 csillag
        System.out.println(" *****"); //1 space, 5 csillag
        System.out.println("  ***"); //2 space, 3 csillag
        System.out.println("   *"); //3 space, 1 csillag

        //Automatizált diamond alakzat

        System.out.println("Hello! How much lines do you want in your diamond?");
        System.out.println("(Please give an odd number)");

        Scanner diamondScanner = new Scanner(System.in);
        int diamondRows = diamondScanner.nextInt();

        String lego = "*";
        String blank = " ";

        //Felső rész kiprintelése
        for (int i = 1; i <= (diamondRows / 2) + 1; i++) {
            for (int j = 1; j <= diamondRows - i; j++) {
                System.out.print(blank);
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(lego);
            }
            System.out.println("");
        }
        //Alsó rész kiprintelése
        for (int i = 1; i <= (diamondRows / 2); i++) {
            for (int j = diamondRows + ((diamondRows - 3) / 2); j >= diamondRows - i; j--) {
                System.out.print(blank);
            }
            for (int k = diamondRows - 2; k >= (i * 2) - 1; k--) {
                System.out.print(lego);
            }
            System.out.println("");
        }
    }
}