package anagram;

import java.util.Arrays;

public class Anagram {
  public Anagram() {
  }

  public boolean isAnagram(String input1, String input2) {
    boolean isItAnAnagram;

    if (input1.length() != input2.length()) {
      isItAnAnagram = false;
    } else {
      char[] input1Array = input1.toLowerCase().toCharArray();
      char[] input2Array = input2.toLowerCase().toCharArray();

      Arrays.sort(input1Array);
      Arrays.sort(input2Array);

      isItAnAnagram = Arrays.equals(input1Array, input2Array);
    }
    if (isItAnAnagram) {
      return true;
    } else {
      return false;
    }
  }
}
