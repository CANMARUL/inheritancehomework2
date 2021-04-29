package inheritanceOdev;

public class InstructorManager extends UserManager {
	
	public void instructorAdd(Instructor ins) {
		System.out.println("isim: " + ins.getUserName()+ "|| Eðitim alaný: "+ ins.getEducationField()+"|| Ünvaný: "+ ins.getRank() );
		
	}

}
