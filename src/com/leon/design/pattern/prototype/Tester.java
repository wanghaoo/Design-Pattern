package com.leon.design.pattern.prototype;

public class Tester {

	public static void main(String[] args)  {
		try {
			Prototype _p = new Prototype("原型模式", "用来克隆对象");
			Prototype _cp = _p.clone();
			_p.setValue("1");
			_cp.setValue("2");
			System.out.println(_cp.getValue());
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}		
	}
	
}
