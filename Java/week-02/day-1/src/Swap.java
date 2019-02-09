public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Original value of a: " + a);
        System.out.println("Original value of b: " + b);

        //Swapping here
        int c = a;
        a = b;
        b = c;

        System.out.println("Swapped value of a: " + a);
        System.out.println("Swapped value of b: " + b);
    }
}