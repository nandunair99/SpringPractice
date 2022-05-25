package StudentTest;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;

	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}
