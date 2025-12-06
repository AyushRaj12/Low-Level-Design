package BuilderDesign;

import java.util.List;

public abstract class StudentBuilder {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String> subjects;
	
	//return type is same for all the setters
	public StudentBuilder setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
		return this;
	}
	
	public StudentBuilder setAge(int age) {
		this.age=age;
		return this;
	}
	
	public StudentBuilder setName(String name) {
		this.name=name;
		return this;
	}
	
	public StudentBuilder setFatherName(String fatherName) {
		this.fatherName=fatherName;
		return this;
	}
	
	public StudentBuilder setMotherName(String motherName) {
		this.motherName=motherName;
		return this;
	}
	
	//we can create different type of objects with different functionalities
	public abstract StudentBuilder setSubjects();
	
	//this build method is of type concrete class is mandatory to create a object of required type
	public Student build() {
		return new Student(this);
	}
	
	
}
