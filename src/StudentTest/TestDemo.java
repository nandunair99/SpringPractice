package StudentTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {

		ProfessionFactory.getInstance().init();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student1 = (Student) context.getBean("studentbean");
		//Student student2 = (Student) context.getBean("studentbean2");
		Student student3 = (Student) context.getBean("studentbean3");
		student1.displayInfo();
		//student2.displayInfo();
		student3.displayInfo();
	}
}
