package com.learn.object.inner;
/**
 * 静态内部类
 * @author reyshaw
 * 1.只能直接访问外部类的静态成员
 * 2.如果要访问外部类的非静态成员,则需要借助外部类的实例
 */
public class StaticInnerClass {
	
	private static int staticVar = 10; 
	
	private int var = 20;
	
	public StaticInnerClass() {
	
	}
	
	public static class Inner {
		public Inner() {
			
		}
		public static int staticVar = 11;
		public int var = 21;
		 
		// 访问外部
		public void getI() {
			StaticInnerClass sic = new StaticInnerClass();
			System.out.println("StaticInnerClass var:" + sic.var); // 访问外部非静态属性
			System.out.println("StaticInnerClass stitic var:" + StaticInnerClass.staticVar); // 如果没冲突,可以直接用staticVar访问外部类静态属性
			say(); // 直接访问外部类的静态方法
		}
	}
	
	// 外部类静态方法
	public static void say() {
		Inner inner = new Inner();
		System.out.println("inner var: " + inner.var);
		System.out.println("inner static var: " + Inner.staticVar);
	}
}
