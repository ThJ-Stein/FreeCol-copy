package net.sf.freecol.common.model;

import org.junit.*;
import net.sf.freecol.common.model.Multiply;

public class TestMultiply extends TestCase {
  private Multiply multiplier = new Multiply();

  public void testMultiply() {
      assertEquals(64, multiplier.multiply(8,8), "Multiplication should work");          
  }

  public void testMultiplyWithZero() {
      assertEquals(0, multiplier.multiply(0,8), "Multiple with zero should be zero");
      assertEquals(0, multiplier.multiply(8,0), "Multiple with zero should be zero");
  }
}
