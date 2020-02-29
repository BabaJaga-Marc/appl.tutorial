package appl.tutorial.school;

import java.util.ArrayList;
import java.util.List;

public class Schoolclass {
	private final int year;
	private final String classname;
	private List<Pupil> pupils = new ArrayList<Pupil>();

	public Schoolclass(int year, String classname) {
		super();
		this.year = year;
		this.classname = classname;
	}

	public int getYear() {
		return year;
	}

	public String getClassname() {
		return classname;
	}

	public void addPupil(Pupil pupil) {
		pupils.add(pupil);
	}

	public List<Pupil> getPupils() {
		return pupils;
	}

}
