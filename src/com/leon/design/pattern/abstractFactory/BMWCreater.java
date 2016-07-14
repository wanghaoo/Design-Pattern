package com.leon.design.pattern.abstractFactory;

public class BMWCreater extends AbstactCreate{

	@Override
	public AbstractSportsCar getSportCar() {
		return new SportsBMW();
	}

	@Override
	public AbstractCar getCar() {
		return new BMW();
	}

}
