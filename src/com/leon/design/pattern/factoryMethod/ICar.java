package com.leon.design.pattern.factoryMethod;
/**
 * 小车接口
 * @author datadriver
 *
 */
public interface ICar {
	
	/**
	 * 启动
	 */
	public void start();
	
	/**
	 * 可以滴滴叫
	 */
	public void didi();
	
	/**
	 *  加速
	 * @param speed
	 */
	public void accelerate(int speed);
	
	/**
	 * 停止
	 */
	public void stop();
	
}
