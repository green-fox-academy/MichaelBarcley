package sharpie;

import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
  @Test
  public void testUse() {
    Sharpie mySharpiePen = new Sharpie("red", 12, 54);
    double initialInkAmount = mySharpiePen.inkAmount;
    mySharpiePen.use();
    assertEquals(53, initialInkAmount - 1, 0);
  }

}
