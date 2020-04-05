package com.learn.object.Polymorphism;
/**
 * 多态示例
 * @author reyshaw
 * 总结：
 * 1.需满足继承关系和父类引用指向子类对象
 * 2.子类自动转为父类后
 *		2.1 只有重写了父类方法的方法有效,超出父类的将不能调用
 *		2.2 静态方法实例是指向父类的(也就是静态方法不能重写的问题,其实已经重写)
 * 3.再强制转换前,先用instanceof判断下类型,不然可能会运行时异常
 */
public class Person {
	private String name; //人的公有属性

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() { // 人公有的方法
		System.out.println("Person walk");
	}
	
	public static void say() {
		System.out.println("person say... staticly");
	}
}
