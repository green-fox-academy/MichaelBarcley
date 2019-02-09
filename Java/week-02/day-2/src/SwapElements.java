import java.util.Collections;

public class SwapElements {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    public static void main(String[] args) {
        String abc[] = {"first", "second", "third"};
        String temp = abc[2];
        abc[2] = abc[0];
        abc[0] = temp;
        for(String szoveg: abc) {
            System.out.println(szoveg);
        }
    }
}
