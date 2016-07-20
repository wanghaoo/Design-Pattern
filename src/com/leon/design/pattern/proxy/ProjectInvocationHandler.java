package com.leon.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProjectInvocationHandler implements InvocationHandler {

	public Object product;
	
	public ProjectInvocationHandler(Object _product) {
		this.product = _product;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.product, args);
	}

}
