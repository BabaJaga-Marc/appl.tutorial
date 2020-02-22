package appl.tutorial.arrays;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ArrayTest {
	@Test
	public void arraytesten() {
		int[] numbers = new int[100];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		int thirdElement = numbers[2];
		int lengthOfNumbersArray = numbers.length;
		assertTrue(lengthOfNumbersArray == 100);
		assertTrue(thirdElement == 3);
	}
}
