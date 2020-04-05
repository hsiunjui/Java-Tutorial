package com.learn.object.Polymorphism;
/**
 * �ӿڶ���
 * @author reyshaw
 *1.�ӿڵ�Ĭ�����η���public,����Ҳ��(abstract����ʡ��),�������������η�
 *2.����Ĭ����public statc final��
 *3.����ȫ�����ǳ��󷽷�(jdk1.8�Ժ�������default��static������)
 *4.�ӿڿ��Լ̳�,���ҿ��Լ̳ж��(��̳���,��������ͬ,������ڱ�������ȷ����,ע���������ʱ�����ᱨ��)
 *5.�ӿڵ�static�������ܱ������ֵ���(ʵ��)ֱ�ӵ���,��Ҫʹ�ýӿ���(��̬����������Ǹ��ӿ�).��̬����
 */
public interface InterfaceA {
	
	public static final int NUM = 10;
	
	String URL = "http://localhost:8080"; // Ĭ�Ͼ���public static final��
	
	public abstract void say(); // abstract����ʡ��
	
	// ��������������jdk 1.8��֧�ֵ�
	default void sayHello() {
		System.out.println("Hello");
	}
	
	// ����������Ʋ��ܼ̳�...(����������)
	public static void print() {
		System.out.println("interfaceA static method");
	}
}