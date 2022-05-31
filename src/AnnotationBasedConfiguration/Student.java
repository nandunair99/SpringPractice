package AnnotationBasedConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import AnnotationBasedConfiguration.Student;

@PropertySource("classpath:jdbc.properties")
public class Student {

	private Person person;
	private String course;
	
	public Student()
	{}
	@Autowired
	public Student(@Qualifier("main")Person person) {
		System.out.println("Constructor with 1 arg called");
		this.person = person;
	}
	public Student(Person person,String course) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}
	
	public void setPerson(@Qualifier("main")Person person) {
		System.out.println("person setter");
		this.person = person;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(@Value("${jdbc.database}")String course) {
		System.out.println("course setter");
		this.course = course;
		System.out.println("inside course setter"+course);
	}

	@Override
	public String toString() {
		
		return "Student [person=" + person.getName() + ", course=" + course + "]";
	}
	@PostConstruct
	public void onStart()
	{
		System.out.println("lifeccyle begins");
	}@PreDestroy
	public void onDestroy()
	{
		System.out.println("lifecycle ends");
	}

}
