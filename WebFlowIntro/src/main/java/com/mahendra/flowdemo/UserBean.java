package com.mahendra.flowdemo;

import java.io.Serializable;

public class UserBean implements Serializable{
	 
	private static final long serialVersionUID = 4657462015039726030L;
	private String userId;
	private String email;
	private Integer age;
 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
 
}
