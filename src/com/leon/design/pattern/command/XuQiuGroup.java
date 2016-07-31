package com.leon.design.pattern.command;

public class XuQiuGroup implements IGroup{

	@Override
	public void add() {
		System.out.println("需求组和新需求");
	}

	@Override
	public void update() {
		System.out.println("要死，需求组改需求了");
	}

	@Override
	public void delete() {
		System.out.println("需求组删除需求");
	}
	
	public void fengXi() {
		System.out.println("需求组分析需求");
	}

}
