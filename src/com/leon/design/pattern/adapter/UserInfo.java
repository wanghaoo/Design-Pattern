package com.leon.design.pattern.adapter;

public class UserInfo implements IUserInfo {
	private String userName;
	private String age;
	private String position;

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public String getAge() {
		return this.age;
	}

	@Override
	public String getPosition() {
		return this.position;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
