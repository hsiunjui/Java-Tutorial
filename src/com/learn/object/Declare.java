package com.learn.object;
/**
 * 声明一个类
 * class关键字只能被public/abstract/final修饰(内部类除外)
 * @author reyshaw
 */
public class Declare {
	private String name; // 成员
	private static int num = 0; // 静态成员
	
	// 无参构造器(默认会有一个无参构造器)
	public Declare() {
		System.out.println("DeclareClass的无参构造器...");
	}
	
	// 带参数的构造器(如果定义了带参构造器,要使用无参构造器则需要显示声明)
	public Declare(String name) throws Exception {
		this.setName(name);
	}
	
	// 成员的get方法
	public String getName() {
		return this.name;
	}
	
	// 成员的set方法
	public void setName(String name) throws Exception {
		if(name.length() >= 2) {
			this.name = name;
		} else {
			throw new Exception("name必须2位及以上字符");
		}
	}
	
	// 静态方法
	public static void printInfo(Declare dc) {
		System.out.println("Name:" + dc.getName() +", Static num:" + num);
	}
}
