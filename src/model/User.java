package model;

import java.io.Serializable;

public class User implements Serializable {

	private String id;
	private String name;
	private String pass;
	private String mail;
	private String botName;

	public User() {}

	public User(String id, String name, String pass, String mail, String botName) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.mail = mail;
		this.botName = botName;
	}

	public User(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public String getMail() {
		return mail;
	}

	public String getBotName() {
		return botName;
	}


}
