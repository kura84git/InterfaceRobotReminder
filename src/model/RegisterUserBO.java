package model;

import dao.AccountDAO;

public class RegisterUserBO {
	public boolean execute(User registerUser) { //アカウント登録処理

		AccountDAO dao = new AccountDAO();
		dao.insert(registerUser);

		return true;

	}
}
