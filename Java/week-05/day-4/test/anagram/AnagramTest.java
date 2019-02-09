package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  @Test
  public void testIfAnagram_true() {
     Anagram testAnagram = new Anagram();
     assertTrue(testAnagram.isAnagram("god", "dog"));
  }

  @Test
  public void testIfAnagram_false() {
    Anagram testAnagram = new Anagram();
    assertFalse(testAnagram.isAnagram("borkbork", "dog"));
  }
}
