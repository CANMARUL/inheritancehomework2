package inheritanceOdev;

public class StudentManager extends UserManager {
	
	public void studensAdd(Student[] student) {
		
		for(Student students: student) {
			System.out.println("Öğrenci ismi: "+students.getUserName()
			+" || Öğrenci Emaili:||"+students.getEmail()
					+" ||Öğrenci numarası: "+ students.getId()+"|| Öğrenci şifresi: "+
					students.getPassword()+" ||Öğrenci Bölümü: "+
					students.getStudentDepartment());
					
		}
		
		
	}

}
