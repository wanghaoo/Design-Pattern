package com.leon.design.pattern.factoryMethod;

/**
 * 测试类
 * @author datadriver
 *
 */
public class Tester {
	
	public static void main(String[] args) {
		try {
			CarFactoryMethod _cfm = new CarFactoryMethod();
			Benz _benz = (Benz) _cfm.getCar(Benz.class);
			_benz.start();
			_benz.didi();
			_benz.accelerate(120);
			_benz.stop();
			BMW _bmw = (BMW) _cfm.getCar(BMW.class);
			_bmw.start();
			_bmw.didi();
			_bmw.accelerate(120);
			_bmw.stop();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
}
