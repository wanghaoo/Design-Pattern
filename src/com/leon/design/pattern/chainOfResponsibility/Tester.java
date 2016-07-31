package com.leon.design.pattern.chainOfResponsibility;

public class Tester {
	
	public static void main(String[] args) {
		IHandler father = new Father();
		IHandler brother = new Brother();
		IHandler son = new Son();
		father.setNext(brother);
		brother.setNext(son);
		
		for (int i = 0; i < 5; i++) {
			Woman woman = new Woman();
			woman.request();
			father.handlerMessage(woman);
			System.out.println("#####################");
		}
		
	}
	
}
