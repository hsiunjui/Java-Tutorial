package com.learn.object.extend;

public class Base {
	public String pub = "pub";
	protected String pro = "pro";
	String def = "def";
	private String pri = "pri";
	
	public static final String STATIC = "static"; // 常量
	
	// 无参构造器,如果有带参构造器,子类又没有显示调用,无参构造器必须要显示声明
	public Base() {
		
	}
	
	// 公有方法
	public String getPub() {
		System.out.println("public getPub()");
		return pub;
	}
	// 受保护性的方法
	protected String getPro() {
		System.out.println("protected getPro()");
		return pro;
	}
	// 默认性的方法
	String getDef() {
		System.out.println("default getDef()");
		return def;
	}
	// 私有方法
	private String getPri() {
		System.out.println("private getPri()");
		return pri;
	}
	
	// 为上面的私有方法提供接口
	public String getPri1() {
		System.out.println("public getPri1()");
		return getPri();
	}
	
	// 静态方法
	protected static void pubStatic() {
		System.out.println("Base public static pubStatic");
	}
}
