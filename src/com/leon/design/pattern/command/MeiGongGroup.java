package com.leon.design.pattern.command;

public class MeiGongGroup implements IGroup{

	@Override
	public void add() {
		System.out.println("美工组添加页面");
	}

	@Override
	public void update() {
		System.out.println("美工组修改页面");
	}

	@Override
	public void delete() {
		System.out.println("美工组删除页面");
	}
	
	public void beiZhiHui() {
		System.out.println("美工组妈的天天被指挥");
	}

}
