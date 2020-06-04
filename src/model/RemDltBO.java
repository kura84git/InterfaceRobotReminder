package model;

import dao.RemDltDAO;

public class RemDltBO {
	public boolean execute(Remind remDlt) { //リマインド削除処理
		RemDltDAO dao = new RemDltDAO();
		return dao.update(remDlt);
	}
}
