package com.leon.design.pattern.abstractFactory;

/**
 * 轿车产品簇抽象类
 * @author lion
 * @version 1.7
 */
public abstract class AbstractCar {
	
	/**
	 * 启动
	 */
	public void start() {
		System.out.println(getCarName() + "启动了！");
	}
	
	/**
	 * 停止
	 */
	public void stop() {
		System.out.println(getCarName() + "熄火了！");
	}
	
	/**
	 * 获得轿车名称
	 * @return String
	 */
	public abstract String getCarName();
	
	/**
	 * 获得轿车稳定度
	 * @return String
	 */
	public abstract String getWenDingDu();
	
}
