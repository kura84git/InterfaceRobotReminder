package model;

import java.io.Serializable;

public class Remind implements Serializable{

	private int remindId;
	private String userId;
	private String remind;
	private String category;

	public Remind() {}

	public Remind(int remindId, String userId, String remind, String category) {
		this.remindId = remindId;
		this.userId = userId;
		this.remind = remind;
		this.category = category;
	}

	public Remind(String userId, String remind, String category) {
		this.userId = userId;
		this.remind = remind;
		this.category = category;
	}

	public Remind(String category) {
		this.category = category;
	}

	public Remind(int remindId, String userId) {
		this.remindId = remindId;
		this.userId = userId;
	}


	public int getRemindId() {
		return remindId;
	}

	public String getUserId() {
		return userId;
	}

	public String getRemind() {
		return remind;
	}

	public String getCategory() {
		return category;
	}



}
