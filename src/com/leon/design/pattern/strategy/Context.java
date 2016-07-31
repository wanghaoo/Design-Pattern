package com.leon.design.pattern.strategy;

public class Context {
	private ICalculator _calculator;
	
	public Context(ICalculator calculator) {
		this._calculator = calculator;
	}
	
	public void operat(int a, int b) {
		this._calculator.calculate(a, b);
	}
}
