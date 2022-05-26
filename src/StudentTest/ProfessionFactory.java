package StudentTest;

public class ProfessionFactory {

	private static ProfessionFactory factory = null;
	private static Student student = null;

	private ProfessionFactory() {
		
	}

	public static ProfessionFactory getInstance() {
		if (factory == null) {
			factory = new ProfessionFactory();
		}
		return factory;
	}

	public Student getStudentInstance() {
		return student;
	}

	public void init() {
		student = new Student();
	}
}
