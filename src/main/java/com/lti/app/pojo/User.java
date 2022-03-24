package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration99")
public class User {

	@Column(name="title")
	private String title;
	
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [title=" + title + ", userName=" + userName + ", password=" + password + "]";
	}
	public User(String title, String userName, String password) {
		super();
		this.title = title;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
