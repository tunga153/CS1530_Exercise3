import org.junit.Test;
import static org.junit.Assert.*;

import CS1530.Exercise3;

public class Exercise3Test {

  @Test
  public void testTriangle0() {
    assertEquals(Exercise3.triangle(0), 0);
  }

  @Test
  public void testTriangle5() {
    assertEquals(Exercise3.triangle(5), 15);
  }

  @Test
  public void testTriangle8() {
    assertEquals(Exercise3.triangle(8), 36);
  }

  @Test
  public void testLazy0() {
    assertEquals(Exercise3.lazyCaterer(0), 1);
  }

  @Test
  public void testLazy2() {
    assertEquals(Exercise3.lazyCaterer(2), 4);
  }

  @Test
  public void testLazy7() {
    assertEquals(Exercise3.lazyCaterer(7), 29);
  }

}
