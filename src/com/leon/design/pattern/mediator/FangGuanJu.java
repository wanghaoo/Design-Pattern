package com.leon.design.pattern.mediator;

public class FangGuanJu extends AbstractorColleague{
	
	public FangGuanJu(AbstractMediator _am) {
		super(_am);
	}
	
	public void faFangChanZheng () {
		System.out.println("发房产证");
	}
	
	public void deal() {
		System.out.println("我要改证");
		super._am.execute("deal");
	}
	
}
