package com.learn.object.Polymorphism.test;

import com.learn.object.Polymorphism.InterfaceA;
import com.learn.object.Polymorphism.InterfaceImplements;
import com.learn.object.Polymorphism.InterfaceImplementsMany;

public class TestInterface {
	public static void main(String[] args) {
		// 实现一个继承多个接口的接口
		InterfaceImplements ii = new InterfaceImplements();
		ii.say();
		System.out.println(InterfaceImplements.NUM);
		InterfaceA.print();
		
		// 实现多个接口
		InterfaceImplementsMany iim = new InterfaceImplementsMany();
		iim.say();
		System.out.println(InterfaceImplementsMany.NUM);
//		iim.print(); // 不能访问接口的静态方法
//		InterfaceImplementsMany.print(); // 不能访问接口的静态方法
		InterfaceA.print();  // 只能通过该接口名访问
		
	}
}
