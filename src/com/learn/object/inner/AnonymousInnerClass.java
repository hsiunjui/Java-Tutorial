package com.learn.object.inner;
/**
 * 匿名内部类
 * @author reyshaw
 * 1.没有类型名称、实例对象名称,且没有构造器
 * 2.不能拥有静态成员
 * 3.可以实现那接口或继承父类(二者不可兼得)
 * 4.匿名内部类编译后是外部类.$序号.class
 */

public class AnonymousInnerClass {
	public void move(Person person) {
		person.run();
	} 
	
	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		// 该参数是一个匿名内部类,这其实是一个类,只是简化了很多过程,因为它只用一次
		aic.move(new Person() {
			public void run() {
				System.out.println("I am running...");
			}
		});
	}
}

// 抽象类
abstract class Person {
	public abstract void run();
}
