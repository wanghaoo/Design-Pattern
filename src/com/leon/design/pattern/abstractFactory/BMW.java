package com.leon.design.pattern.abstractFactory;

public class BMW extends AbstractCar {

	@Override
	public String getCarName() {
		return "BWM w.1";
	}

	@Override
	public String getWenDingDu() {
		return getCarName() + ": 稳定度为89.8%";
	}

}
