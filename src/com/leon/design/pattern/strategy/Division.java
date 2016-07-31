package com.leon.design.pattern.strategy;

public class Division implements ICalculator {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Division : " + a / b);
	}

}
