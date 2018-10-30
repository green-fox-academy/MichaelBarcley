import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Greetings! Let's play the Anagram game!");
        System.out.println("Please give me a string, then I'll ask you to give another one.");
        System.out.println("I'll decide if the two given words are anagrams (output: true) " +
                "or false (output: false).");
        System.out.println("");
        isAnagram(inputScanners1(), inputScanners2());

    }

    public static String inputScanners1() {
        //Asking for the first word
        System.out.println("Please give me the first String.");
        Scanner firstWord = new Scanner(System.in);
        String input1 = firstWord.next();
        return input1;
    }

    public static String inputScanners2() {
        //Asking for the second word
        System.out.println("Please give me the second String.");
        Scanner secondWord = new Scanner(System.in);
        String input2 = secondWord.next();
        return input2;
    }

    public static void isAnagram(String input1, String input2) {
        boolean isItAnAnagram;

        if (input1.length() != input2.length()) {
            isItAnAnagram = false;
        } else {
            //Convert words into character arrays
            char[] input1Array = input1.toLowerCase().toCharArray();
            char[] input2Array = input2.toLowerCase().toCharArray();

            //ABC order for both character arrays
            Arrays.sort(input1Array);
            Arrays.sort(input2Array);

            isItAnAnagram = Arrays.equals(input1Array, input2Array);
        }
        if (isItAnAnagram) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}