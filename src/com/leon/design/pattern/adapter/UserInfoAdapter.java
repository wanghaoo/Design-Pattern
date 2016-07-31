package com.leon.design.pattern.adapter;

public class UserInfoAdapter extends OuterUserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		return super.getUserInfo().get("userName");
	}

	@Override
	public String getAge() {
		return super.getUserInfo().get("age");
	}

	@Override
	public String getPosition() {
		return super.getUserInfo().get("position");
	}

}
