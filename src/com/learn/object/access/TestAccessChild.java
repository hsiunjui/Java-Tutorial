package com.learn.object.access;

/**
 * �����������ⲿ���ʼ��ڲ�����(�ò��������λ��ͬһ����)
 * @author reyshaw
 * ���Է��ʳ�private������г�Ա
 */
public class TestAccessChild {
	
	public static void main(String[] args) {
		AccessChild ac = new AccessChild();
		
		/*** �����ⲿ���� ***/
		System.out.println(ac.pubAttr);
		System.out.println(ac.proAttr);
		System.out.println(ac.defAttr);
		// System.out.println(ac.priAttr); // X, ���������˽������
		ac.pubFunc();
		ac.proFunc();
		ac.defFunc();
		// ac.priFunc(); // X,���������˽�з���
		
		/*** �����ڲ����� ***/
		ac.getAccessBaseAttr();
	}
}
