package com.learn.object.Polymorphism;

public class Teacher extends Person {
	// ��ʦ��walk����
	public void walk() {
		System.out.println("Teacher walk...");
	}
	
	// ��ʦ�����з���
	public void teach() {
		System.out.println("Teacher teach");
	}
	
	// ��д��̬����(ע��ʵ���ĵ��÷�ʽ)
	public static void say() {
		System.out.println("Teacher say... staticly");
	}
}
