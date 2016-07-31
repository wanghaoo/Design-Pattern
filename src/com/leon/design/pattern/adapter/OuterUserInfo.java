package com.leon.design.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserInfo {
	
	private String userName;
	private String age;
	private String position;
	
	public Map<String, String> getUserInfo () {
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("userName", getUserName());
		resultMap.put("age", getAge());
		resultMap.put("position", getPosition());
		return resultMap;
	}
	
	private String getUserName() {
		return userName;
	}
	private String getAge() {
		return age;
	}
	private String getPosition() {
		return position;
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
