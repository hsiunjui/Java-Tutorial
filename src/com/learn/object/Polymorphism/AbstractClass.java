package com.learn.object.Polymorphism;
/**
 * �����ඨ��
 * @author reyshaw
 * �ܽ�:
 * 1.���������û�г��󷽷�
 * 2.����г��󷽷�,��÷��������з�����
 * 3.���û��ʵ�ֳ�����ķ���,��÷���Ҳ��������Ϊ������(������̳�)
 */
public abstract class AbstractClass {
	public abstract void sayHello(); // ���󷽷�
}


// ʵ�ֳ�����
class Instace extends AbstractClass {
	public void sayHello() {
		System.out.println("ʵ�ַ���");
	}
}