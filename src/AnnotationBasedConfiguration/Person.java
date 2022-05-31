package AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;


public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter");
		this.name = name;
	}
}
