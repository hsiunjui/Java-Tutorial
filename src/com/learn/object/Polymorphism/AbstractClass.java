package com.learn.object.Polymorphism;
/**
 * 抽象类定义
 * @author reyshaw
 * 总结:
 * 1.抽象类可以没有抽象方法
 * 2.如果有抽象方法,则该方法不能有方法体
 * 3.如果没有实现抽象类的方法,则该方法也必须声明为抽象类(抽象类继承)
 */
public abstract class AbstractClass {
	public abstract void sayHello(); // 抽象方法
}


// 实现抽象类
class Instace extends AbstractClass {
	public void sayHello() {
		System.out.println("实现方法");
	}
}