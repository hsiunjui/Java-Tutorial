package com.learn.object.extend;
/**
 * 子类继承父类
 * @author reyshaw
 * 总结：
 *1.继承其实是保留了父类的一个实例
 *2.可以重写父类的方法(静态和非静态)
 *3.属性是可以重名的,父子之间互不影响(要调用父类用super)
 *4.这个过程有点像Javascript中原型链的概念
 *5.被final修饰的类不能被继承
 */
public class Child extends Base {
	
	 //子类属性可以和父类重名
	protected String pro = "child pro";
	
	// 如果不重写该方法,外部调用还是调用的父类的
	protected String getPro() {
		return pro;
	}
	
	// 无参构造器
	public Child() {
		System.out.println("111");
	}
	
	// 内部访问父类属性和方法
	public void getSuperInfo() {
	//  访问属性
			System.out.println(super.pub);
			System.out.println(super.pro);
			System.out.println(super.def);
			// System.out.println(child.pri); // X,私有属性不允许访问
			
			// 访问方法
			super.getPub();
			super.getDef();
			super.getPro();
//			child.getPri(); // X,私有方法不能访问
			
			// 访问静态方法
			Base.pubStatic();
	}
	
	// 重写静态方法(重写方法是修饰符必须大于等于父类)
	public static void pubStatic() {
		// Base.pubStatic();
		System.out.println("Child static method");
	}
}
