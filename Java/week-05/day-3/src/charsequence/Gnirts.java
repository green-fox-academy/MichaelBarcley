package charsequence;

public class Gnirts implements CharSequence {
  String randomString;

  Gnirts(String randomString) {
    this.randomString = randomString;
  }

  @Override
  public int length() {
    return this.randomString.length();
  }

  @Override
  public char charAt(int i) {
    return this.randomString.charAt(this.length() - i - 1);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return null;
  }
}
