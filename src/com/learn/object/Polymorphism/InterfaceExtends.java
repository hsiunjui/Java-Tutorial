package com.learn.object.Polymorphism;
/**
 * �ӿڼ̳�
 * @author reyshaw
 * ע�⣺
 * ��InterfaceA,InterfaceB������ͬ�ĳ�����ʱ,������Ҫ��ʾ����ó���
 * (ע�����ﲻ��ʾ���岢���ᱨ��!!!,����ȡֵ��ʱ��ͻᱨ����!!!)
 * 
 * ���InterfaceA,InterfaceB�ж���������ͬ��sayHello��default����,�������д�÷���
 */

public interface InterfaceExtends extends InterfaceA, InterfaceB {
	int NUM = 1000; // ������ﲻ��ʾ����,����ʵ��������ʱ�ᱨ��

	@Override
	default void sayHello() {
		// TODO Auto-generated method stub
		InterfaceA.super.sayHello();
	}
}