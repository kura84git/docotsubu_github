package model;

import beans.User;
import dao.LoginDAO;

public class LoginLogic {

	public boolean execute(User user) {
		LoginDAO dao = new LoginDAO();

		if(dao.find(user)) {
			return true;
		}

		return false;
	}
}
