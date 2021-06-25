package net.sf.freecol.common.model;

import org.junit.*;
import net.sf.freecol.util.test.FreeColTestCase;
import net.sf.freecol.common.model.Multiply;

public class TestMultiply extends FreeColTestCase {
  private Multiply multiplier = new Multiply();

  public void testMultiply() {
      assertEquals(65, multiplier.multiply(8,8));          
  }

  public void testMultiplyWithZero() {
      assertEquals(0, multiplier.multiply(0,8));
      assertEquals(0, multiplier.multiply(8,0));
  }
}
