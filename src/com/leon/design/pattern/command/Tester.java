package com.leon.design.pattern.command;

public class Tester {

	public static void main(String[] args) {
		Invoker _invoker = new Invoker(new TianJiaXuQiuCommand());
		_invoker.action();
		System.out.println("#########################");
		Invoker _invoker2 = new Invoker(new XiuGaiXuQiuCommand());
		_invoker2.action();
		System.out.println("#########################");
		Invoker _invoker3 = new Invoker(new ShanChuXuQiuCommand());
		_invoker3.action();
	}
	
}
