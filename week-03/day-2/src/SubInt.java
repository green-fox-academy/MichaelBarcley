import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList<String> subInt(int index, int[] numArray) {
        String[] numArrayStringed = new String[numArray.length];
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < numArray.length; i++) {
            numArrayStringed[i] = String.valueOf(numArray[i]);
        }

        for (int i = 0; i < numArrayStringed.length; i++) {
            if (numArrayStringed[i].contains(Integer.toString(index))) {
                resultList.add(Integer.toString(i));
            }
        }
        
        return resultList;
    }
}