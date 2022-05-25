package StudentTest;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private Person person;
	private String course;

	@Autowired
	public Student(Person person,String course) {
		this.course=course;
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void displayInfo() {
		System.out.println("Hello: " + this.person.getName()+ " Course: "+this.course);
	}
}
