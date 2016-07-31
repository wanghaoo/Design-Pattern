package com.leon.design.pattern.command;

public class TianJiaXuQiuCommand extends Command{

	@Override
	public void execute() {
		super.xuQiuGroup.fengXi();
		super.meiGongGroup.add();
		super.shiXianGroup.shiXian();
	}

}
