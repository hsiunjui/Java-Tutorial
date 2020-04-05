package com.learn.object;
/**
 * 代码块{}
 * @author reyshaw
 * 1.静态代码块会最先执行(在类加载的时候)
 * 2.构造代码块会先于构造器执行
 * 3.方法中的代码块相当于开辟了一个临时作用域
 */
public class CodeBlock {
	// 私有属性
	private String name = "hello world";
	
	 // 静态代码块
	static {
		System.out.println("静态代码块er....");
	}
	
	// 静态成员
	private static int var;
	
	// 构造代码块
	{
		System.out.println("构造代码块er...");
	}
	
	// 构造器
	public CodeBlock() {
		System.out.println("构造器..." + name);
	}
	
	// 方法
	public String getName() {
		{ // 局部代码块
			System.out.println("1111");
		}
		return name;
	}
	
	public static int getVar() {
		return var;
	}
}
