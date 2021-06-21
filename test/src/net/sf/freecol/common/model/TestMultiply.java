package net.sf.freecol.common.model;

import org.junit.*;
import net.sf.freecol.common.model.Multiply;

public class TestMultiply extends TestCase {
  private Multiply multiplier;
  
  @BeforeEach
  public void setUp() throws Excepton {
    multiplier = new Multiply();
  }
  
  @Test                                               
    @DisplayName("Multiplication test")   
    public void testMultiply() {
        assertEquals(64, multiplier.multiply(8,8),      
        "Multiplication should work");          
    }

  @RepeatedTest(3)                                    
  @DisplayName("Multiplication with zero test")
  public void testMultiplyWithZero() {
      assertEquals(0, multiplier.multiply(0,8), "Multiple with zero should be zero");
      assertEquals(0, multiplier.multiply(8,0), "Multiple with zero should be zero");
  }
}
