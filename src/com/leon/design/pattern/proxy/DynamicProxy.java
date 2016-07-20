package com.leon.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static <T> T newProxyInstance (ClassLoader loader, Class<?>[] interfaces, InvocationHandler ih) {
		new SubAdvance().excute();
		return (T)Proxy.newProxyInstance(loader, interfaces, ih);
	}
}
