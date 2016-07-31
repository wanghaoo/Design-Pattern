package com.leon.design.pattern.abstractFactory;

public class Tester {

	public static void main(String[] args) {
		/*轿车生产者*/
		AbstactCreate _create = new BMWCreater();
		/*运动车生产者*/
		AbstactCreate _create2 = new BenzCreater();
		AbstractCar _bmw = _create.getCar();
		_bmw.start();
		System.out.println(_bmw.getWenDingDu());
		_bmw.stop();
		AbstractSportsCar _sportBMW =  _create.getSportCar();
		_sportBMW.start();
		System.out.println(_sportBMW.getJiSu());
		_sportBMW.stop();
		AbstractCar _benz = _create2.getCar();
		_benz.start();
		System.out.println(_benz.getWenDingDu());
		_benz.stop();
		AbstractSportsCar _sportsBenz = _create2.getSportCar();
		_sportsBenz.start();
		System.out.println(_sportsBenz.getJiSu());
		_sportsBenz.stop();
	}
	
}
