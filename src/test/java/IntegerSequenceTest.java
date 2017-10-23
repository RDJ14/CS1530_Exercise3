import org.junit.Test;
import static org.junit.Assert.*;


public class IntegerSequenceTest{

  @Test
  public void testLazyCaterZero(){
    assertEquals(IntegerSequence.lazyCater(0), 1);
  }

  @Test
  public void testLazyCaterOne(){
    assertEquals(IntegerSequence.lazyCater(1), 2);
  }

  @Test
  public void testLazyCaterFive(){
    assertEquals(IntegerSequence.lazyCater(5), 16);
  }

  @Test
  public void testTriangleZero(){
    assertEquals(IntegerSequence.triangle(0), 0);
  }

  @Test
  public void testTriangleFive(){
    assertEquals(IntegerSequence.triangle(5), 15);
  }

  @Test
  public void testTriangleOne(){
    assertEquals(IntegerSequence.triangle(1), 1);
  }

}
