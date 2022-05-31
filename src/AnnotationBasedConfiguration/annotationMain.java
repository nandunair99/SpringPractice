package AnnotationBasedConfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		Student student1 = (Student) context.getBean(Student.class);
		System.out.println(student1);
		context.registerShutdownHook();
	}

}
	