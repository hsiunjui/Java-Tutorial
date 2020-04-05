package com.learn.object.extend;
/**
 * ����̳и���
 * @author reyshaw
 * �ܽ᣺
 *1.�̳���ʵ�Ǳ����˸����һ��ʵ��
 *2.������д����ķ���(��̬�ͷǾ�̬)
 *3.�����ǿ���������,����֮�以��Ӱ��(Ҫ���ø�����super)
 *4.��������е���Javascript��ԭ�����ĸ���
 *5.��final���ε��಻�ܱ��̳�
 */
public class Child extends Base {
	
	 //�������Կ��Ժ͸�������
	protected String pro = "child pro";
	
	// �������д�÷���,�ⲿ���û��ǵ��õĸ����
	protected String getPro() {
		return pro;
	}
	
	// �޲ι�����
	public Child() {
		System.out.println("111");
	}
	
	// �ڲ����ʸ������Ժͷ���
	public void getSuperInfo() {
	//  ��������
			System.out.println(super.pub);
			System.out.println(super.pro);
			System.out.println(super.def);
			// System.out.println(child.pri); // X,˽�����Բ��������
			
			// ���ʷ���
			super.getPub();
			super.getDef();
			super.getPro();
//			child.getPri(); // X,˽�з������ܷ���
			
			// ���ʾ�̬����
			Base.pubStatic();
	}
	
	// ��д��̬����(��д���������η�������ڵ��ڸ���)
	public static void pubStatic() {
		// Base.pubStatic();
		System.out.println("Child static method");
	}
}
