package com.learn.object.inner;
/**
 * ��Ա�ڲ���
 * @author reyshaw
 * 1.����ֱ��ʵ����,��Ҫ�����ⲿ��ʵ�����߷���
 * 2.�ڲ������ֱ�ӷ����ⲿ������Ժͷ���,�ڲ����Ժͷ������ⲿ��ͻʱ,����ʹ���ڲ���
 * 3.�ⲿ�����Ҫ�����ڲ���ĳ�Ա,����ͨ���ڲ����ʵ��
 * 4.�ڲ������������ļ����ⲿ��$�ڲ���.class
 */
public class MemberClass { // �ⲿ��
	private int i = 10;
	public MemberClass() {
	}
	
	 //�ڲ���,�ͳ�Աһ��,����ʹ�����еķ������η�
	public class Inner {
//		private int i = 20; // ���ڲ��������ⲿ������������ʱ,����ʹ���ڲ���
		int j = 30;
		public Inner() {}
		public void getValueI() {
			// System.out.println(MemberClass.this.i); // �����ͻ,����ʹ��������ʽ�����ⲿ����
			say(); // ֱ�ӵ����ⲿ���˽�з���
			System.out.println(i); // ֱ�ӷ����ⲿ���˽������
		}
		
		// �ڲ�ͬ������,������ʹ��
//		private void say() {
//			System.out.println("Hi!");
//		}
	}
	
	// �ⲿ��ķ���
	private void say() {
		Inner inner = new Inner(); // �ⲿ������ڲ����Ա
		System.out.println("Inner j: " + inner.j);
	}
	
	// �����ڲ��ڵķ���
	public Inner getInterInstance() {
		return new Inner();
	}
}
