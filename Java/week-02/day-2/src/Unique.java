import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        int myArray[] = {1, 11, 34, 11, 52, 61, 1, 34}; //Megoldás 1
        int uniqueArray[] = IntStream.of(myArray).distinct().toArray(); //Megoldás 1
        for (int i = 0; i < Array.getLength(uniqueArray); i++) { //Megoldás 1
            System.out.print(uniqueArray[i] + " "); //Megoldás 1
        }
        System.out.println("");
        uniqueMaker(myArray); //Megoldás 2
    }

    public static void uniqueMaker(int dasArray[]) {
        int uniqueArray[] = IntStream.of(dasArray).distinct().toArray();
        for (int i = 0; i < dasArray.length - (dasArray.length - uniqueArray.length); i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}