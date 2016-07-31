package com.leon.design.pattern.strategy;

public class Multiplication implements ICalculator {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Multiplication : " + a * b);
	}

}
