package appl.tutorial.keywords;

public class AnimalZoo {

	public static void main(String[] args) {
		Object xxx = new Animal("tiger");
		if (xxx instanceof Animal) {
			System.out.println("tiger is an animal");
		} else {
			System.out.println("tiger is not an animal");
		}

	}
}
