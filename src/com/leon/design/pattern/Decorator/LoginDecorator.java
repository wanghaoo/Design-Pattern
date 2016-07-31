package com.leon.design.pattern.Decorator;

public abstract class LoginDecorator extends ILogin{
	
	public ILogin login = null;
	
	public LoginDecorator (ILogin login) {
		this.login = login;
	}
	
}
