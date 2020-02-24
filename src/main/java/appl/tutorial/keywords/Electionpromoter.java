package appl.tutorial.keywords;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Electionpromoter {

	public static void main(String[] args) {
		Electionpromoter electionpromoter = new Electionpromoter();
		System.out.println(electionpromoter.canVote(20));
	}

	@Test
	public void testBoolean() {
		Electionpromoter electionpromoter = new Electionpromoter();
		assertTrue(electionpromoter.canVote(20));
		assertTrue(electionpromoter.canVote(18));
		assertFalse(electionpromoter.canVote(17));
	}

	public boolean canVote(int age) {
		if (age >= 18)
			return true;
		{
			return false;
		}
	}
}