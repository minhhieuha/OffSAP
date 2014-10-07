package com.erp.sap.model;

public class User {
	private int id;
	private String userName;
	private String passWord;

	public User() {
	}

	public User(String title, String author) {
		super();
		this.userName = title;
		this.passWord = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}
}
