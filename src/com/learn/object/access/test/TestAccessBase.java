package com.learn.object.access.test;

import com.learn.object.access.AccessBase;

/**
 * ��ͬ�����������
 * @author reyshaw
 * ��ͬ��������,ֻ���Է���public��Ա
 */
public class TestAccessBase {
	public static void main(String[] args) {
		
		AccessBase ab = new AccessBase();
		
		System.out.println(ab.pubAttr);
//		System.out.println(ab.proAttr); // X,��ͬ��,���������protected����
//		System.out.println(ab.defAttr); // X,��ͬ��,���������default����
//		System.out.println(ab.priAttr); // X,��ͬ��,���������private����
		
		ab.pubFunc();
//		ab.proFunc(); // X,��ͬ��,���������protected����
//		ab.defFunc(); // X,��ͬ��,���������default����
//		ab.priFunc(); // X,��ͬ��,���������private����
	}
}
