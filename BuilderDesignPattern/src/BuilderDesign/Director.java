package BuilderDesign;

public class Director {
      
	StudentBuilder studentBuilder;
	
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder=studentBuilder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineerStudentBuilder ) {
			return createEngineeringStudent();
		}else if(studentBuilder instanceof MBAStudentBuilder){
			return createMBAStudent();
		}
		return null;
	}

	private Student createMBAStudent() {
		// TODO Auto-generated method stub
		return studentBuilder.setRollNumber(123).setAge(25).setName("Raj").setSubjects().build();
		//return null;
	}

	private Student createEngineeringStudent() {
		// TODO Auto-generated method stub
		return studentBuilder.setRollNumber(1234).setAge(26).setName("Ayush").setSubjects().setFatherName("Manoj").build();
    }
}
