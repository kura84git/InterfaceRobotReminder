package model;

import dao.RemUpdDAO;

public class RemUpdBO {
	public boolean execute(Remind remUpd) { //リマインド書き換え処理
		RemUpdDAO dao = new RemUpdDAO();
		return dao.update(remUpd);
	}
}
