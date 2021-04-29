package inheritanceOdev;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setUserName("ENG�N");
		instructor.setPassword("engin1234");
		instructor.setRank("professional");
		instructor.setEducationField("Computer");

		Student student1 = new Student();
		
		student1.setUserName("FAHR� CAN");
		student1.setId(1);
		student1.setPassword("fahri123");
		student1.setStudentDepartment("Computer ENG�Neer");
		student1.setStudentNo("754");
		student1.setEmail("fahrimarull@icloud.com");

		Student student2 = new Student();
		student2.setUserName("Bahad�r");
		student2.setId(2);
		student2.setPassword("bahad�r123");
		student2.setStudentDepartment("Computer ENG�Neer");
		student2.setStudentNo("745");
		student2.setEmail("bahad�rversan@icloud.com");

		User[] user = { instructor, student2, student1};
		UserManager userManager = new UserManager();
		userManager.saveInformation(user);

		System.out.println("*******************************************");
		
		InstructorManager insmanager = new InstructorManager();
		insmanager.instructorAdd(instructor);
		
		System.out.println("*******************************************");

		StudentManager studentManager = new StudentManager();
		Student[] student = { student1, student2};
		studentManager.studensAdd(student);

	}

}
