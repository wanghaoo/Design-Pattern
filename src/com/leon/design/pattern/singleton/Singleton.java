package com.leon.design.pattern.singleton;
/**
 * 单例模式
 * @author leon
 * @date 2016-07-12
 * @version java7
 */
public class Singleton{
	/**
	 * 懒汉单列模式
	 */
	private static final Singleton _singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return _singleton;
	}
	
}
