package com.leon.design.pattern.abstractFactory;

/**
 * 抽象工厂类
 * @author lion
 * @version 1.7
 */
public abstract class AbstactCreate {
	/**
	 * 获得运动汽车
	 * @return
	 */
	public abstract AbstractSportsCar getSportCar();
	
	/**
	 * 获得轿车
	 * @return
	 */
	public abstract AbstractCar getCar();
}
