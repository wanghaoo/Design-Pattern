package com.leon.design.pattern.builder;

public class Direct {
	
	public static void builderCon1() {
		Builder _builder = new ConBuilder();
		_builder.setPart(new Product());
		_builder.buildProduct();
	}
	
}
