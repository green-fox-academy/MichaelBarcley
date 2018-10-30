import java.lang.reflect.Array;

public class DoubleItems {
    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    public static void main(String[] args) {
        int numList[] = {3, 4, 5, 6, 7};
        for (int i = 0; i < Array.getLength(numList); i++) {
            System.out.println(doubler(numList[i]));
        }
    }

    public static int doubler(int megszorzando) {
        return 2 * megszorzando;
    }
}
