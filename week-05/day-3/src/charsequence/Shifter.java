package charsequence;

public class Shifter implements CharSequence {
  String randomString;
  int shifter;

  Shifter(String randomString, int shifter) {
    this.randomString = randomString;
    this.shifter = shifter;
  }

  @Override
  public int length() {
    return this.randomString.length();
  }

  @Override
  public char charAt(int i) {
    return this.randomString.charAt(i + this.shifter);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    return null;
  }
}
