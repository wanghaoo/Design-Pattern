package com.leon.design.pattern.command;

public class ShiXianGroup implements IGroup{

	@Override
	public void add() {
		System.out.println("程序员加功能");
	}

	@Override
	public void update() {
		System.out.println("程序员改逻辑");		
	}

	@Override
	public void delete() {
		System.out.println("程序员删除功能");
	}
	
	public void shiXian() {
		System.out.println("程序员实现功能");
	}

}
