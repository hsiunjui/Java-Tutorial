package com.learn.object.Polymorphism.test;

import com.learn.object.Polymorphism.InterfaceA;
import com.learn.object.Polymorphism.InterfaceImplements;
import com.learn.object.Polymorphism.InterfaceImplementsMany;

public class TestInterface {
	public static void main(String[] args) {
		// ʵ��һ���̳ж���ӿڵĽӿ�
		InterfaceImplements ii = new InterfaceImplements();
		ii.say();
		System.out.println(InterfaceImplements.NUM);
		InterfaceA.print();
		
		// ʵ�ֶ���ӿ�
		InterfaceImplementsMany iim = new InterfaceImplementsMany();
		iim.say();
		System.out.println(InterfaceImplementsMany.NUM);
//		iim.print(); // ���ܷ��ʽӿڵľ�̬����
//		InterfaceImplementsMany.print(); // ���ܷ��ʽӿڵľ�̬����
		InterfaceA.print();  // ֻ��ͨ���ýӿ�������
		
	}
}
