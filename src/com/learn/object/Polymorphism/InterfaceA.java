package com.learn.object.Polymorphism;
/**
 * 接口定义
 * @author reyshaw
 *1.接口的默认修饰符是public,方法也是(abstract可以省略),不允许其他修饰符
 *2.属性默认是public statc final的
 *3.方法全部都是抽象方法(jdk1.8以后允许有default和static方法体)
 *4.接口可以继承,而且可以继承多个(多继承中,常量名相同,则必须在本类中明确声明,注意编译器这时并不会报错)
 *5.接口的static方法不能被其显现的类(实例)直接调用,需要使用接口名(静态方法定义的那个接口).静态方法
 */
public interface InterfaceA {
	
	public static final int NUM = 10;
	
	String URL = "http://localhost:8080"; // 默认就是public static final的
	
	public abstract void say(); // abstract可以省略
	
	// 以下两个方法是jdk 1.8后支持的
	default void sayHello() {
		System.out.println("Hello");
	}
	
	// 这个方法好似不能继承...(见测试用例)
	public static void print() {
		System.out.println("interfaceA static method");
	}
}