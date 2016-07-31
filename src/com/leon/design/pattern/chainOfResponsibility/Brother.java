package com.leon.design.pattern.chainOfResponsibility;

public class Brother extends IHandler{

	public Brother() {
		super(IHandler.BROTHER);
	}

	@Override
	public void response() {
		System.out.println("大哥同意");
	}

}
