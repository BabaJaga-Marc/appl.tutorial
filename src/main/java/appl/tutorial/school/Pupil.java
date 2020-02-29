package appl.tutorial.school;

public class Pupil extends Person {

	private int age;

	public Pupil(String n, int age) {
		super(n);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
