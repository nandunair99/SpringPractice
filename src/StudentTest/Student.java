package StudentTest;

import org.springframework.beans.factory.annotation.Autowired;

public class Student implements IProfession {
	private Person person;
	private String course;

	public Student() {
		System.out.println("Constructor with 0 parameters called");
		this.course = "MSCIT";
		this.person = new Person("nair");
	}

	public void onStart() {
		System.out.print("on start");
	}

	
	public Student(Person person, String course) {
		System.out.println("Constructor with 2 parameters called");
		this.course = course;
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		System.out.println("Set person");
		this.person = person;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		System.out.println("Set course");
		this.course = course;
	}

	public void displayInfo() {
		System.out.println("Hello: " + this.person.getName() + " Course: " + this.course);
	}
}
