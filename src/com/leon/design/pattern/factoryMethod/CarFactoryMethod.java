package com.leon.design.pattern.factoryMethod;

/**
 * 工厂方法
 * @author datadriver
 *
 */
public class CarFactoryMethod extends ICarFactoryMethod{
	
	/**
	 * 获得小车实例
	 * @param c
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public <T extends ICar> ICar getCar (Class<T> c) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class.forName(c.getName());
		ICar _car = (ICar)c.newInstance();
		return _car;
	}

}
