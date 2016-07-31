package com.leon.design.pattern.abstractFactory;

public class SportsBenz extends AbstractSportsCar{

	@Override
	public String getJiSu() {
		return getCarName() + " :极速为300码!";
	}

	@Override
	public String getCarName() {
		return "Benz Sz.1";
	}

}
