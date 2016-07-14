package com.leon.design.pattern.factoryMethod;

/**
 * 工厂接口
 * @author datadriver
 *
 */
public abstract class ICarFactoryMethod {

	public abstract <T extends ICar> ICar getCar(Class<T> c) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException;
	
}
