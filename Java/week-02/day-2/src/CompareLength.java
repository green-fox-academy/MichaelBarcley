import java.lang.reflect.Array;

public class CompareLength {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`
    public static void main(String[] args) {
        int p1[] = {1,2,3};
        int p2[] = {4,5};
        System.out.println(Array.getLength(p1) < Array.getLength(p2));
        System.out.println("Items in p1[]: " + Array.getLength(p1));
        System.out.println("Items in p2[]: " + Array.getLength(p2));
    }
}
