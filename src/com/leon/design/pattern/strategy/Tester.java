package com.leon.design.pattern.strategy;

public class Tester {
	
	public static void main(String[] args) {
		ICalculator calculator = new Addition();
		calculator.calculate(6, 2);
		calculator = new Subtraction();
		calculator.calculate(6, 2);
		calculator = new Multiplication();
		calculator.calculate(6, 2);
		calculator = new Division();
		calculator.calculate(6, 2);
		
		System.out.println(StrategyEnum.ADD.exec(6, 2));
	}
	
}
