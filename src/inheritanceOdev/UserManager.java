package inheritanceOdev;

import java.awt.desktop.UserSessionEvent;

public class UserManager {

	public void saveInformation(User[] user) {
		
		for (User users : user) {
			System.out.println("Kullanc� ismi: "+ users.getUserName() +"|| Kullan�c� id: "+ users.getId()+
					" ||Kullan�c� �ifresi: " + users.getPassword());
			
		}

	}

}
