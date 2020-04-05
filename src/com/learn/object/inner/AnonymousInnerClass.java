package com.learn.object.inner;
/**
 * �����ڲ���
 * @author reyshaw
 * 1.û���������ơ�ʵ����������,��û�й�����
 * 2.����ӵ�о�̬��Ա
 * 3.����ʵ���ǽӿڻ�̳и���(���߲��ɼ��)
 * 4.�����ڲ����������ⲿ��.$���.class
 */

public class AnonymousInnerClass {
	public void move(Person person) {
		person.run();
	} 
	
	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		// �ò�����һ�������ڲ���,����ʵ��һ����,ֻ�Ǽ��˺ܶ����,��Ϊ��ֻ��һ��
		aic.move(new Person() {
			public void run() {
				System.out.println("I am running...");
			}
		});
	}
}

// ������
abstract class Person {
	public abstract void run();
}
