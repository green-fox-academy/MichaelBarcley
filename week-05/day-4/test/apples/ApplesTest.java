package apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void testGetApple() {
    Apples redApple = new Apples();
    assertEquals("apple", redApple.getApple());
  }

}
