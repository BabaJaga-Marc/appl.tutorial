package appl.tutorial.keywords;

public class ArgsTest {
	int args = 0;

	public static void main(String[] args) {
		if (args.length > 0) {
			if (args[0].equals("test")) {
				// load test parameters
			} else if (args[0].equals("production")) {
				// load production parameters
			}
		}
	}
}
