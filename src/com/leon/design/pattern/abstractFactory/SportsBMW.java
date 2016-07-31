package com.leon.design.pattern.abstractFactory;

public class SportsBMW extends AbstractSportsCar{

	@Override
	public String getJiSu() {
		return getCarName() + " :极速为350码";
	}

	@Override
	public String getCarName() {
		return "BWM Sm.1";
	}

}
