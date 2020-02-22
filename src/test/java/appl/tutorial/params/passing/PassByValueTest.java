package appl.tutorial.params.passing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassByValueTest {

	@Test
	public void whenModifyingObjects_thenOriginalObjectChanged() {
		Foo a = new Foo(1);
		Foo b = new Foo(1);

		// Before Modification
		assertEquals(a.num, 1);
		assertEquals(b.num, 1);

		modify(a, b);

		// After Modification
		assertEquals(a.num, 2);
		assertEquals(b.num, 1);
	}

	public static void modify(Foo a1, Foo b1) {
		a1.num++;

		b1 = new Foo(1);
		b1.num++;
	}

}
