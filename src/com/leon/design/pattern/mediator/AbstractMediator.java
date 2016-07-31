package com.leon.design.pattern.mediator;

public abstract class AbstractMediator {

	protected FangDong _fangDong;
	protected FangKe _fangKe;
	protected FangGuanJu _fangGuanJu;
	
	public AbstractMediator() {
		_fangDong = new FangDong(this);
		_fangKe = new FangKe(this);
		_fangGuanJu = new FangGuanJu(this);
	}
	
	protected abstract void execute(String methodName);
	
}
