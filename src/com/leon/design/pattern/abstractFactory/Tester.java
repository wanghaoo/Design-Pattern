package com.leon.design.pattern.abstractFactory;

public class Tester {

	public static void main(String[] args) {
		AbstactCreate _create = new BMWCreater();
		BMW _bmw = (BMW) _create.getCar();
		SportsBMW _sportBMW = (SportsBMW) _create.getSportCar();
		AbstactCreate _create2 = new BenzCreater();
		Benz _benz = (Benz) _create2.getCar();
		SportsBenz _sportsBenz = (SportsBenz) _create2.getSportCar();
	}
	
}
