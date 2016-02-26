package com.perficient.pojo;

import java.util.Date;

public class User {
	
	private int id;
	
	private String username;
	
	private String password;
	
	private String uesrDetail;
	
	private Date brithday;
	
	private String picture;
	
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUesrDetail() {
		return uesrDetail;
	}

	public void setUesrDetail(String uesrDetail) {
		this.uesrDetail = uesrDetail;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", uesrDetail=" + uesrDetail + ", brithday=" + brithday
				+ ", picture=" + picture + ", email=" + email + "]";
	}
	
}
