public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    System.out.println(charReplacer("Hello uvwxyzxxx"));
  }

  public static String charReplacer(String myString) {
    String star = "*";
    String iHateRecursion = myString.substring(1);
    System.out.println(myString.length());
    if (myString.length() == 1) {
      return myString;
    } else {
      return myString.substring(0, 1) + star + charReplacer(iHateRecursion);
    }
  }
}
