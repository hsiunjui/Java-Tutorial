package com.learn.object.access.test;

/**
 * ��ͬ�����������
 * @author reyshaw
 * ֻ�ܷ���public��Ա
 */
public class TestAccessChild {
	
	public static void main(String[] args) {
		AccessChild ac = new AccessChild();
		
		/*** �����ⲿ���� ***/
		System.out.println(ac.pubAttr);
//		System.out.println(ac.proAttr); // X, ��Ϊprotected���ܿ������
//		System.out.println(ac.defAttr); // X
//		System.out.println(ac.priAttr); // X
		ac.pubFunc();
//		ac.proFunc(); // X
//		ac.defFunc(); // X
//		 ac.priFunc(); // X
		
		/*** �����ڲ����� ***/
		ac.getAccessBaseAttr();
	}
}
