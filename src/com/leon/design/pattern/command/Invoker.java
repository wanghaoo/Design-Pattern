package com.leon.design.pattern.command;

public class Invoker {
	
	private Command command = null;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
	
}
