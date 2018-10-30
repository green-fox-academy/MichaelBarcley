import java.lang.reflect.Array;

public class Reverse {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    public static void main(String[] args) {
        int aj[] = {3,4,5,6,7};
        for (int i = 0; i < Array.getLength(aj) / 2; i++) {
            int temp = aj[i];
            aj[i] = aj[Array.getLength(aj) - 1 - i];
            aj[Array.getLength(aj) - 1 - i] = temp;
        }
        for (int i = 0; i < Array.getLength(aj); i++) {
            System.out.println(aj[i]);
        }
    }
}
