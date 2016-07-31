package com.leon.design.pattern.command;

public class XiuGaiXuQiuCommand extends Command{

	@Override
	public void execute() {
		super.xuQiuGroup.update();;
		super.meiGongGroup.beiZhiHui();
		super.shiXianGroup.update();;
	}

}
