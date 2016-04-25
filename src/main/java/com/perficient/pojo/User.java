package com.perficient.pojo;

import java.util.Date;

public class User {
	
	private int id;
	
	private int age;
	
	private String name;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "User [id=" + id + ", age=" + age + ", name=" + name
				+ ", password=" + password + ", uesrDetail=" + uesrDetail
				+ ", brithday=" + brithday + ", picture=" + picture
				+ ", email=" + email + "]";
	}
	
}
