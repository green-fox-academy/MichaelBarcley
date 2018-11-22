package extension;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ExtensionTest {

  Extension extension = new Extension();

  @Test
  public void testAdd_2and3is5() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  public void testMaxOfThree_third() {
    assertEquals(4, extension.maxOfThree(3, 4, 1));
  }

  @Test
  public void testMedian_four() {
    assertEquals(4, extension.median(Arrays.asList(7, 5, 3, 5)));
  }

  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('c'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('z'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
