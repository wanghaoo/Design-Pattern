package com.leon.design.pattern.chainOfResponsibility;

public class Father extends IHandler{

	public Father() {
		super(IHandler.FATHER);
	}

	@Override
	public void response() {
		System.out.println("父亲同意了");
	}

}
