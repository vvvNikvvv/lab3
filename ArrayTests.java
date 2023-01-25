import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {3, 7, 0};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{0,7,3 }, input2);

    int[] input3 = {};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{}, input3);
  	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 4,5,6,7,8};
    assertArrayEquals(new int[]{8,7,6,5,4 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input3 = {2,2,2,2,2,2,2};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input3),0);
  }
}
