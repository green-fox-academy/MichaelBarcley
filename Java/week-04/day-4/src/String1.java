public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(charReplacer("Hello uvwxyzxxx"));
  }

  public static String charReplacer(String myString) {
    if (!myString.contains("x")) {
      return myString;
    } else {
      return charReplacer(myString.replaceFirst("x", "y"));
    }
  }
}
