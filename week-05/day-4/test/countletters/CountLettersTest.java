package countletters;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  @Test
  public void testgetLetterDictionary() {
    CountLetters dude = new CountLetters();
    HashMap<String, Integer> testHashmap = new HashMap<>();
    testHashmap.put("a", 2);
    testHashmap.put("d", 2);
    testHashmap.put("p", 1);
    testHashmap.put("w", 1);
    assertEquals(testHashmap, dude.getLetterDictionary("Wad dap"));
  }

}
