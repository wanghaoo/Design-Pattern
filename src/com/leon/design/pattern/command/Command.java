package com.leon.design.pattern.command;

public abstract class Command {
	
	public XuQiuGroup xuQiuGroup = new XuQiuGroup();
	public ShiXianGroup shiXianGroup = new ShiXianGroup();
	public MeiGongGroup meiGongGroup = new MeiGongGroup();
	
	public abstract void execute();
	
}
