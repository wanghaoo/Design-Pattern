package com.leon.design.pattern.abstractFactory;

public class BenzCreater extends AbstactCreate{

	@Override
	public AbstractSportsCar getSportCar() {
		return new SportsBenz();
	}

	@Override
	public AbstractCar getCar() {
		return new Benz();
	}

}
