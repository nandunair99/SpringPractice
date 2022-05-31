package StudentTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {

		ProfessionFactory.getInstance().init();
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student1 = (Student) context.getBean("studentBean");
		// Student student2 = (Student) context.getBean("studentbean2");
		Student student3 = (Student) context.getBean("studentBean3");
		student1.displayInfo();
		// student2.displayInfo();
		student3.displayInfo();
		Manpower manpower = (Manpower) context.getBean("collectionBean");
		System.out.println(manpower);
		DBConnection dbconnection = (DBConnection) context.getBean("dbSettings");
		System.out.println(dbconnection);
		Student s4=(Student)context.getBean("studentBean4");
		s4.displayInfo();
		context.registerShutdownHook();
	}
}
