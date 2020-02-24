package appl.tutorial.keywords;

public class Animal {

	private String type;
	private String name;
	private int age;

	public Animal(String type) {
		this.type = type;
	}

	public Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}

	public String getAllInfo() {
		return type + ", " + name + "," + age;
	}

	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
