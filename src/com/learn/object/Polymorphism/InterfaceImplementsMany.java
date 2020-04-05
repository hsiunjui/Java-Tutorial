package com.learn.object.Polymorphism;

/**
 * 实现多个接口
 * @author huawei
 * 实现的原则遵循
 */
public class InterfaceImplementsMany implements InterfaceA, InterfaceB {
	
	public static final int NUM = 10000;
	
	@Override
	public void say() {
		System.out.println("InterfaceImplements say()");
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		InterfaceA.super.sayHello();
	}
	
//	public static void print() {
//		// TODO Auto-generated method stub
//		System.out.println("InterfaceImplements static print()");
//	}

}
