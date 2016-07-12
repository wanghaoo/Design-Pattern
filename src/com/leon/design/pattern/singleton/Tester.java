package com.leon.design.pattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试者类
 * @author datadriver
 *
 */
public class Tester {
	
	public static void main(String[] args) {
		List<Singleton> _list = new ArrayList<Singleton>();
		for (int i = 0; i < 10; i++) {
			_list.add(Singleton.getInstance());
		}
		
		for (int i = 0; i < _list.size(); i++){
			if (i == 0) {
				continue;
			}
			System.out.println(_list.get(i) == _list.get(i - 1));
		}
	}
}
