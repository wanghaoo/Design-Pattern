package com.leon.design.pattern.strategy;

public class Addition implements ICalculator {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Add : " + a + b);
	}

}
