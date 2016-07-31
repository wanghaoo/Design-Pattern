package com.leon.design.pattern.mediator;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String methodName) {
		if ("kanFang".equals(methodName)) {
			this.kanFang();
			return;
		}
		
		if ("maiFang".equals(methodName)) {
			this.maiFang();
			return;
		}
		
		if ("deal".equals(methodName)) {
			this.deal();
			return;
		}
	}
	
	private void deal() {
		super._fangKe.youQian();
		super._fangDong.youKongFang();
	}
	
	private void kanFang() {
		super._fangDong.youKongFang();
	}
	
	private void maiFang() {
		super._fangDong.youKongFang();
	}
}
