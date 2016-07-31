package com.leon.design.pattern.chainOfResponsibility;

public abstract class IHandler {
	
	public static final int FATHER = 0;
	public static final int BROTHER = 1;
	public static final int SON = 2;
	
	public int requestLevel = 0;
	private IHandler nextHandler;
	
	public IHandler (int level) {
		this.requestLevel = level;
	}
	
	public void setNext(IHandler _handler) {
		this.nextHandler = _handler;
	}
	
	public abstract void response();
	
	public final void handlerMessage(Woman woman) {
		if (this.requestLevel == woman.type) {
			this.response();
		} else {
			if (nextHandler != null) {
				this.nextHandler.handlerMessage(woman);
			} else {
				System.out.println("没有人可以处理");
			}
		}
	}

}
