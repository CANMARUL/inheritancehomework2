package inheritanceOdev;

public class Instructor extends User{

	
	
	private String educationField;
	private String rank;


	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getEducationField() {
		return educationField;
	}

	public void setEducationField(String educationField) {
		this.educationField=educationField;
	}
	
}
