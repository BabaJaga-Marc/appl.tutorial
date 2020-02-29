package appl.tutorial.school;

import java.util.ArrayList;
import java.util.List;

public class School {
	private final String name;
	private List<Schoolclass> schoolclasses = new ArrayList<Schoolclass>();
	private List<Pupil> pupils = new ArrayList<Pupil>();
	private int maxPupilPerClass;

	public School(String name, int maxPupilPerClass) {
		super();
		this.name = name;
		this.maxPupilPerClass = maxPupilPerClass;
	}

	public String getName() {
		return name;
	}

	public void addSchoolclass(int year, String letter) {
		schoolclasses.add(new Schoolclass(year, year + letter));
	}

	public List<Schoolclass> getSchoolclasses() {
		return schoolclasses;
	}

	public void addPupil(String name, int age) {
		Pupil pupil = new Pupil(name, age);
		int year = age - 6;
		pupils.add(pupil);
		addPupilToSchoolclass(pupil, year);
	}

	private void addPupilToSchoolclass(Pupil pupil, int year) {
		List<Schoolclass> schoolclassesOfYear = new ArrayList<Schoolclass>();

		for (Schoolclass schoolclass : schoolclasses) {
			if (schoolclass.getYear() == year)
				schoolclassesOfYear.add(schoolclass);
		}

		for (Schoolclass schoolclass : schoolclassesOfYear) {
			if (schoolclass.getPupils().size() <= maxPupilPerClass) {
				schoolclass.addPupil(pupil);
				return;
			}
		}

	}
}
