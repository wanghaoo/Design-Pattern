package com.leon.design.pattern.command;

public class ShanChuXuQiuCommand extends Command{

	@Override
	public void execute() {
		super.xuQiuGroup.delete();
		super.meiGongGroup.delete();
		super.shiXianGroup.delete();
	}

}
