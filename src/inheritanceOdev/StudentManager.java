package inheritanceOdev;

public class StudentManager extends UserManager {
	
	public void studensAdd(Student[] student) {
		
		for(Student students: student) {
			System.out.println("��renci ismi: "+students.getUserName()
			+" || ��renci Emaili:||"+students.getEmail()
					+" ||��renci numaras�: "+ students.getId()+"|| ��renci �ifresi: "+
					students.getPassword()+" ||��renci B�l�m�: "+
					students.getStudentDepartment());
					
		}
		
		
	}

}
