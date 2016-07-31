package com.leon.design.pattern.abstractFactory;

public class Benz extends AbstractCar {

	@Override
	public String getCarName() {
		return "Benz z.1";
	}

	@Override
	public String getWenDingDu() {
		return getCarName() + ": 稳定度为：90.1%";
	}

}
