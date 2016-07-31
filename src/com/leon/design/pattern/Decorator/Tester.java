package com.leon.design.pattern.Decorator;

public class Tester {
	
	public static void main(String[] args) {
		ILogin login = new Login();
		 login = new QRCodeLogin(login);
		 login = new EmailLogin(login);
		 login.login();
	}
}
