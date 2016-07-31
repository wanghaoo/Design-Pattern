package com.leon.design.pattern.strategy;

public class Subtraction implements ICalculator {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}

}
