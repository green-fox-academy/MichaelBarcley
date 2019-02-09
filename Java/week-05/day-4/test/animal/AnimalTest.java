package animal;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  Animal dog = new Animal(20, 20);
  int initialHunger = 20;
  int initialThirst = 20;

  @Test
  public void eat() {
    assertEquals(19, initialHunger - 1);
  }

  @Test
  public void drink() {
    assertEquals(19, initialThirst - 1);
  }

  @Test
  public void play() {
    assertEquals(19, initialThirst - 1);
    assertEquals(19, initialHunger - 1);
  }
}
