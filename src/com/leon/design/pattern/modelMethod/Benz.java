package com.leon.design.pattern.modelMethod;

public class Benz extends Car{

	public void didi() {
		System.out.println("benz didi");
	}

	public void start() {
		System.out.println("benz start");
		
	}

	public void stop() {
		System.out.println("benz stop");
	}

	@Override
	protected boolean needDidi() {
		return false;
	}

}
