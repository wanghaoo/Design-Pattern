package com.leon.design.pattern.mediator;

public class FangDong extends AbstractorColleague{
	
	public FangDong(AbstractMediator _am) {
		super(_am);
	}

	public void shouFang () {
		System.out.println("我要卖房子");
		super._am.execute("maiFang");
	}
	
	public boolean youKongFang() {
		System.out.println("我有空房");
		return true;
	}
	
}
