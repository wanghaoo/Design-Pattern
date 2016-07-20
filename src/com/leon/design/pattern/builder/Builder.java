package com.leon.design.pattern.builder;

public interface Builder {
	
	public void setPart(Product product);
	
	public Product buildProduct();
	
}
