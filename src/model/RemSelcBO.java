package model;

import dao.RemSelcDAO;

public class RemSelcBO {
	public Remind execute(Remind id) { //一意のリマインドの取得処理
		RemSelcDAO dao = new RemSelcDAO();
		return dao.selectOne(id);
	}
}
