public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(charReplacer("Hello uvwxyzxxx"));
  }

  public static String charReplacer(String myString) {
    if (!myString.contains("x")) {
      return myString;
    } else {
      return charReplacer(myString.replaceFirst("x", ""));
    }
  }
}
