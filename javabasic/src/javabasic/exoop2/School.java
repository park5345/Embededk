package javabasic.exoop2;

public class School {
	
	private String school;
	private String name;
	private int student;
	
	public School() {
		
	}

	public School(String school, String name, int student) {
		this.school = school;
		this.name = name;
		this.student = student;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getstudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [school=" + school + ", name=" + name + ", student=" + student + "]";
	}
	

}
