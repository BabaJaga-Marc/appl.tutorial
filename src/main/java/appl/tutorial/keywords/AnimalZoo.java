package appl.tutorial.keywords;

import java.util.ArrayList;
import java.util.List;

public class AnimalZoo {

	private List<Animal> animalList = new ArrayList<Animal>();

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

	public static void main(String[] args) {
		Object xxx = new Animal("tiger");
		if (xxx instanceof Animal) {
			System.out.println("tiger is an animal");
		} else {
			System.out.println("tiger is not an animal");
		}

		AnimalZoo animalZoo = new AnimalZoo();

		Animal ape = new Animal("ape");
		ape.setName("Igo");
		ape.setAge(5);
		animalZoo.addAnimal(ape);
		animalZoo.addAnimal(new Animal("turtle", "mimi", 110));
		// animalZoo.printAllMyAnimals();
		animalZoo.printAllMyAnimalsOlderThan(2);
	}

	private void printAllMyAnimalsOlderThan(int olderThan) {
		for (Animal animal : animalList) {
			if (animal.getAge() > olderThan)
				System.out.println(animal.getAllInfo());
		}
	}

	public void printAllMyAnimals() {
		for (Animal animal : animalList) {
			System.out.println(animal.getType() + ", " + animal.getName());
		}
	}
}
