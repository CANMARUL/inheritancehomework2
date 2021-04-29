package inheritanceOdev;

public class User { //(Ortak metot)

	private int id;
	private String userName;
	private String password;
	
	
	
	
	public void setId(int id) {
		this.id=id;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}
