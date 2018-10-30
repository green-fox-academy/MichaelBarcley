import java.util.Scanner;

public class PrintParams {
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourth")
    // ...
    public static void main(String[] args) {
        printParams("Mi", "ez", "a", "feladat,", "omg!");
    }

    public static void convertString(String... inputText) {
        for(int i = 1; i < inputText.length; i++) {
            System.out.println(inputText[i] + " ");
        }
    }

    public static void printParams(String... inputText) {
        for(String allInputs: inputText) {
            System.out.print(allInputs + " ");
        }
    }

    public static String stringScanner() {
        Scanner scanner = new Scanner(System.in);
        String givenText = scanner.next();
        return givenText;
    }
}
