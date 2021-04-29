package inheritanceOdev;

public class Student extends User {
	
	private String email;
	private String studentNo;
	private String studentDepartment;

	

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
