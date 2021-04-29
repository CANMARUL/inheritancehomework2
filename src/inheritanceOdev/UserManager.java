package inheritanceOdev;

import java.awt.desktop.UserSessionEvent;

public class UserManager {

	public void saveInformation(User[] user) {
		
		for (User users : user) {
			System.out.println("Kullancý ismi: "+ users.getUserName() +"|| Kullanýcý id: "+ users.getId()+
					" ||Kullanýcý þifresi: " + users.getPassword());
			
		}

	}

}
