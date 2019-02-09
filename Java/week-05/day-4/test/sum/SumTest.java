package sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void testArrayListSum_empty() {
    Sum newSum = new Sum();
    ArrayList<Integer> myList = new ArrayList<>();

    assertEquals(0, newSum.getArrayListSum(myList));
  }

  @Test
  public void testArrayListSum_oneItem() {
    Sum newSum = new Sum();
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(10);

    assertEquals(10, newSum.getArrayListSum(myList));
  }

  @Test
  public void testArrayListSum_multipleItems() {
    Sum newSum = new Sum();
    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2, 5, 3, 1));

    assertEquals(11, newSum.getArrayListSum(myList));
  }

  @Test (expected = NullPointerException.class)
  public void testArrayListSum_null() {
    Sum newSum = new Sum();
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(null);

    assertEquals(null, newSum.getArrayListSum(myList));
  }
}
