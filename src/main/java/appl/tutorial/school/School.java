package appl.tutorial.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	private final String name;
	private List<Schoolclass> schoolclasses = new ArrayList<Schoolclass>();
	private List<Pupil> pupils = new ArrayList<Pupil>();
	private Map<String, Schoolclass> schoolclassMap = new HashMap<String, Schoolclass>();

	public School(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addSchoolclass(int year, String letter) {
		String classname = year + letter;
		Schoolclass schoolClass = new Schoolclass(year, classname);
		schoolclasses.add(schoolClass);
		schoolclassMap.put(classname, schoolClass);
	}

	public Schoolclass getSchoolclass(String classname) {
		return schoolclassMap.get(classname);
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

		Schoolclass schoolclassToAdd = schoolclassesOfYear.get(0);
		Schoolclass currentSchoolclass = null;
		for (int i = 1; i < schoolclassesOfYear.size(); i++) {
			currentSchoolclass = schoolclassesOfYear.get(i);
			if (currentSchoolclass.getPupils().size() < schoolclassToAdd.getPupils().size()) {
				schoolclassToAdd = currentSchoolclass;
				break;
			}
		}
		schoolclassToAdd.addPupil(pupil);
	}
}
