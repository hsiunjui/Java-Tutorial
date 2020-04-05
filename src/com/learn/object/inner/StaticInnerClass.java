package com.learn.object.inner;
/**
 * ��̬�ڲ���
 * @author reyshaw
 * 1.ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա
 * 2.���Ҫ�����ⲿ��ķǾ�̬��Ա,����Ҫ�����ⲿ���ʵ��
 */
public class StaticInnerClass {
	
	private static int staticVar = 10; 
	
	private int var = 20;
	
	public StaticInnerClass() {
	
	}
	
	public static class Inner {
		public Inner() {
			
		}
		public static int staticVar = 11;
		public int var = 21;
		 
		// �����ⲿ
		public void getI() {
			StaticInnerClass sic = new StaticInnerClass();
			System.out.println("StaticInnerClass var:" + sic.var); // �����ⲿ�Ǿ�̬����
			System.out.println("StaticInnerClass stitic var:" + StaticInnerClass.staticVar); // ���û��ͻ,����ֱ����staticVar�����ⲿ�ྲ̬����
			say(); // ֱ�ӷ����ⲿ��ľ�̬����
		}
	}
	
	// �ⲿ�ྲ̬����
	public static void say() {
		Inner inner = new Inner();
		System.out.println("inner var: " + inner.var);
		System.out.println("inner static var: " + Inner.staticVar);
	}
}
