package com.leon.design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{
	/**
	 * 注：如果是表态的引用对象，就算是深度克隆也没有用
	 * 注：如果是final的对象，深度克隆会报错
	 */
	public ArrayList _list = new ArrayList();
	
	public String name;
	public String use;
	
	public Prototype () {}
	
	/**
	 * 克隆不会执行构造方法
	 * @param _name
	 * @param _use
	 */
	public Prototype (String _name, String _use) {
		this.name = _name;
		this.use = use;
		System.out.println("这是构造方法");
	}
	
	public void setValue (String value) {
		this._list.add(value);
	}
	
	public List getValue () {
		return this._list;
	}
	@Override
	public Prototype clone () throws CloneNotSupportedException {
		Prototype _prototype = null;
		_prototype = (Prototype) super.clone();
		_prototype._list = (ArrayList) this._list.clone();
		return _prototype;
	}
}
