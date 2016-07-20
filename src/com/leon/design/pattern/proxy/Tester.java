package com.leon.design.pattern.proxy;


public class Tester {
	public static void main(String[] args) {
		IProduct product = new Product();
		ProjectInvocationHandler pih = new ProjectInvocationHandler(product);
		IProduct iproduct = DynamicProxy.newProxyInstance(product.getClass().getClassLoader(), product.getClass().getInterfaces(), pih);
		
		iproduct.say();
	}
}
