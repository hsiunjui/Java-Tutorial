package com.learn.object.load;
/**
 * 类的加载顺序-父类
 * @author huawei
 * 静态代码块和静态属性按顺序执行
 * 普通属性和构造代码块也是按顺序执行的
 */
public class Base {
	// 8.父类属性
	private String name = "Base";
	
	// 1.父类静态代码块
	static {
		System.out.println("base static block");
	}
	
	// 2.父类静态成员
	public static boolean isBase;
	
	// 9.父类静态代码块
	{
		System.out.println("Base construct block");
	}
	
	// 7.父类构造器
	public Base() {
		// super(); // 如果有父类会向上执行(默认执行了Object)
		System.out.println("Base construct"); // 10.执行构造器内容,父类构造完成
	}
	
	public String getName() {
		return name;
	}
	
}
