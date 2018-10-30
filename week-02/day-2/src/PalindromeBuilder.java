public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(palindromeBuilder("Demo"));
    }

    public static String palindromeBuilder(String inputText) {
        String reverse = "";
        for (int i = inputText.length() - 1; i >= 0; i--) {
            reverse += inputText.charAt(i);
        }

        String mirroredWord = inputText + reverse;
        return mirroredWord;
    }
}