package appl.tutorial.operators;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperatorTests {

	@Test
	public void testIntegerPrimitives() {
		int number1 = 1;
		int number2 = 2;
		int result = number1 + number2;
		assertTrue("should be 3", result == 3);
	}

	@Test
	public void testIntegerObject() {
		Integer number1 = Integer.valueOf(1);
		Integer number2 = Integer.valueOf(2);
		Integer result = number1 + number2;
		// true, because of boxing
		assertTrue(result.intValue() == 3);
		assertTrue(result == 3);
		assertTrue(result.equals(Integer.valueOf(3)));
	}

	@Test
	public void testStringObject() {
		String number1 = "1";
		String number2 = "2";
		String result = number1 + number2;
		assertFalse(result.equals("3"));
		assertTrue(result.equals("12"));
	}

}
