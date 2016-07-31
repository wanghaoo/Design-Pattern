package com.leon.design.pattern.mediator;

public class Tester {
	public static void main(String[] args) {
		AbstractMediator _am = new Mediator();
		FangDong _fangDong = new FangDong(_am);
		FangKe _fangKe = new FangKe(_am);
		FangGuanJu _fangGuanJu = new FangGuanJu(_am);
		System.out.println("#####卖房子#####");
		_fangDong.shouFang();
		System.out.println("######看房子#####");
		_fangKe.kanFang();
		System.out.println("#####房管局交易######");
		_fangGuanJu.deal();
	}
}
