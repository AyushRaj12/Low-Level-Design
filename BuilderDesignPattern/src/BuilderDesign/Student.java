package BuilderDesign;

import java.util.List;

public class Student {
 
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String> subjects;
	
	//Here you see a small constructor parameter list is only required which solves the problem
	//As studentBuilder type is used to initialize the class attributes
	public Student(StudentBuilder studentBuilder) {
		this.rollNumber=studentBuilder.rollNumber;
		this.age=studentBuilder.age;
		this.name=studentBuilder.name;
		this.fatherName=studentBuilder.fatherName;
		this.motherName=studentBuilder.motherName;
		this.subjects=studentBuilder.subjects;
	}
	
	public String toString() {
		 return ""+ " roll number: " + rollNumber +
	                " age: " + age +
	                " name: " + name +
	                " father name: " + fatherName +
	                " mother name: " + motherName +
	                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);

	}
	
}
