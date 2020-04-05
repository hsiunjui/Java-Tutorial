package com.learn.object.Polymorphism;

public class Student extends Person {
	// 学生的walk方法
	public void walk() {
		System.out.println("Student walk");
	}
	// 学生独有方法
	public void sleep() {
		System.out.println("Student sleep");
	}
}
