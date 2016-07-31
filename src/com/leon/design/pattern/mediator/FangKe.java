package com.leon.design.pattern.mediator;

public class FangKe extends AbstractorColleague{

	public FangKe(AbstractMediator _am) {
		super(_am);
	}
	
	public void maiFang() {
		System.out.println("我要买房子");
	}
	
	public void kanFang() {
		System.out.println("看房子");
		super._am.execute("kanFang");
	}
	
	public boolean youQian () {
		System.out.println("我有足够的钱");
		return true;
	}
	
}
