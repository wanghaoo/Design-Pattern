package com.leon.design.pattern.factoryMethod;

public class BMW implements ICar {

	@Override
	public void start() {
		System.out.println("宝马开始启动啦。。。");

	}

	@Override
	public void didi() {
		System.out.println("宝马滴滴滴。。。");

	}

	@Override
	public void accelerate(int speed) {
		System.out.println("宝马开始加速到" + speed + "。。。");

	}

	@Override
	public void stop() {
		System.out.println("宝马停止啦。。。");

	}

}
