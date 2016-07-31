package com.leon.design.pattern.chainOfResponsibility;

import java.util.Random;

public class Woman implements IWoman{
	
	public int type= 0;
	
	public Woman () {
		Random random = new Random();
		this.type = random.nextInt(5);
	}

	@Override
	public void request() {
		System.out.println("我要去逛街");
	}
	
	

}
