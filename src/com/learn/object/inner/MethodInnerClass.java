package com.learn.object.inner;
/**
 * �����ڲ���(�ֲ��ڲ���)
 * @author reyshaw
 * 1.�����ڲ��಻�����з������η�(��Ϊ�ֲ������������з������η�)
 * 2.���в��ܰ�����̬��Ա,������final,����ʱ������(������)
 * 3.���ֲ�������һ��,�����������,��ʧЧ��
 * 4.������ڲ�����ļ���ʱ�ⲿ��$1�ڲ���.class
 */
public class MethodInnerClass {
	public int var = 10;
	
	public MethodInnerClass() {
		
	}
	public Object test() { // (ûɶ����,��Ϊ�����Ѿ����ֲ���������)
		int i = 20;
		class Inner {
//			public int i = 20;
			public Inner() {
				print();
			}
			public void print() {
				System.out.println(var); // 
				System.out.println(i);
			}
		}
		return new Inner();
		// new Inner().print();
	}
}
