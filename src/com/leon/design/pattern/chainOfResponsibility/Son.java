package com.leon.design.pattern.chainOfResponsibility;

public class Son extends IHandler{

	public Son() {
		super(IHandler.SON);
	}

	@Override
	public void response() {
		System.out.println("儿子同意了");
	}

}
