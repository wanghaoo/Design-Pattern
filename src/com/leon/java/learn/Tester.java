package com.leon.java.learn;

public class Tester {
	public static void main(String[] args) {
		MyClassLoader mcl = new MyClassLoader();
		Class<?> demo = mcl.findClass("/Users/ChenYu/Documents/workspace/DesignPattern/src/com/leon/java/learn/Demo.class");
		try {
			System.out.println(demo.getName());
			Demo _demo = (Demo)demo.newInstance();
			_demo.demo();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
