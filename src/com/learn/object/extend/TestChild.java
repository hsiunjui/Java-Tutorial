package com.learn.object.extend;

public class TestChild {
	public static void main(String[] args) {
		Child child = new Child();
		
		//  ��������
		System.out.println(child.pub);
		System.out.println(child.pro);
		System.out.println(child.def);
		// System.out.println(child.pri); // X,˽�����Բ��������
			
		// ���ʷ���
		child.getPub();
		child.getPro(); // ����������ʵ���������д��ķ���
		child.getDef();
//		child.getPri(); // X,˽�з������ܷ���
		
		// ���ʾ�̬����
		Child.pubStatic();
		
		// ���ʾ�̬����
		System.out.println(Child.STATIC);
		
		// ͨ�����෽�����ʸ���
		child.getSuperInfo();
	}
}
