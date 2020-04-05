package com.learn.object.Polymorphism;

public class Teacher extends Person {
	// 教师的walk方法
	public void walk() {
		System.out.println("Teacher walk...");
	}
	
	// 教师的特有方法
	public void teach() {
		System.out.println("Teacher teach");
	}
	
	// 重写静态方法(注意实例的调用方式)
	public static void say() {
		System.out.println("Teacher say... staticly");
	}
}
