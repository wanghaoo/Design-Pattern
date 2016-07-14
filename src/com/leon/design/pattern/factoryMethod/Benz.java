package com.leon.design.pattern.factoryMethod;

public class Benz implements ICar {

	@Override
	public void start() {
		System.out.println("奔驰开始启动啦。。。");
	}

	@Override
	public void didi() {
		System.out.println("奔驰滴滴滴。。。");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("奔驰加速到" + speed + "啦。。。");
	}

	@Override
	public void stop() {
		System.out.println("奔驰停止啦。。。");
	}

}
