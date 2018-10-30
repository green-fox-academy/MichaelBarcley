public class AppendA {
    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    //    // - Add all elements an `"a"` at the end
    public static void main(String[] args) {
        String animals[] = {"koal", "pand", "zebr"};
        for(String animalTypes: animals) {
            System.out.println(addA(animalTypes));
        }
    }
    public static String addA(String animalName) {
        return animalName + "a";
    }
}
