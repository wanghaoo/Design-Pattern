package com.leon.design.pattern.Decorator;

public  class QRCodeLogin extends LoginDecorator{

	public QRCodeLogin(ILogin login) {
		super(login);
	}

	public void qrCodeLogin () {
		System.out.println("识别了二维码中的用户名和密码");
		return;
	}
	
	@Override
	public void login() {
		this.qrCodeLogin();
		super.login.login();
	}

}
