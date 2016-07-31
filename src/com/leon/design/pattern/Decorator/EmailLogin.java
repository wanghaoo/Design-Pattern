package com.leon.design.pattern.Decorator;

public class EmailLogin extends LoginDecorator{

	public EmailLogin(ILogin login) {
		super(login);
	}
	
	public void emailLogin() {
		System.out.println("邮件登陆拉");
	}

	@Override
	public void login() {
		this.emailLogin();
		super.login.login();
	}
	

}
