package com.leon.design.pattern.modelMethod;

public abstract class Car {
	
	protected abstract void didi();
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract boolean needDidi();
	
	public void run () {
		this.start();
		if (needDidi())
			this.didi();
		this.stop();
	}

}
