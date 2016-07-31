package com.leon.design.pattern.strategy;
/**
 * 策略枚举模式
 * @author datadriver
 *
 */
public enum StrategyEnum {
	
	ADD("+") {
		@Override
		public int exec(int a, int b) {
			return a + b;
		}
	},
	
	SUB("-") {

		@Override
		public int exec(int a, int b) {
			return a - b;
		}
	};
	
	private String value = "";
	
	private StrategyEnum (String value) {
		this.value = value;
	}
	
	public String getValue () {
		return this.value;
	}

	public abstract int exec(int a, int b);
}
