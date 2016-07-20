package com.leon.design.pattern.builder;

public class ConBuilder implements Builder {

	private Product product = null;
	
	@Override
	public void setPart(Product product) {
		this.product = product;
	}

	@Override
	public Product buildProduct() {
		this.product.method1();
		this.product.method2();
		this.product.method3();
		return this.product;
	}

}
