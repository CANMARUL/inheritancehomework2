package inheritanceOdev;

public class InstructorManager extends UserManager {
	
	public void instructorAdd(Instructor ins) {
		System.out.println("isim: " + ins.getUserName()+ "|| E�itim alan�: "+ ins.getEducationField()+"|| �nvan�: "+ ins.getRank() );
		
	}

}
