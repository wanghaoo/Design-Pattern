package com.leon.design.pattern.abstractFactory;

/**
 * 运动汽车产品簇抽象类
 * @author datadriver
 *
 */
public abstract class AbstractSportsCar {
	
	/**
	 * 启动
	 */
	public void start() {
		System.out.println(getCarName() + "启动了！");
	}
	
	/**
	 * 熄火
	 */
	public void stop() {
		System.out.println(getCarName() + "熄火了！");
	}
	
	/**
	 * 最高速度
	 * @return String
	 */
	public abstract String getJiSu();
	
	/**
	 * 获得车名
	 * @return
	 */
	public abstract String getCarName();
}
