package com.learn.object.Polymorphism;

/**
 * ʵ�ֶ���ӿ�
 * @author huawei
 * ʵ�ֵ�ԭ����ѭ
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
