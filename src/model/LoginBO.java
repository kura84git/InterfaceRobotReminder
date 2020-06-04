package model;

import dao.LoginDAO;

public class LoginBO {
	//パスワードの判定をするメソッド
	public boolean excute(User user) {

		LoginDAO dao = new LoginDAO();

		//パスワードがあっていた場合
		if(dao.find(user)) {

			return true;
		}
		//パスワードが間違っていた場合
		return false;
	}
}
