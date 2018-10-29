public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        int a = 10;
        int b = 20;
        int c = 15;

        //Volume = a * b * c
        //Surface = 2(ab + ac + bc)

        System.out.println("Surface area: " + 2 * (a*b + a*c + b*c));
        System.out.println("Volume: " + a * b * c);
    }

}
