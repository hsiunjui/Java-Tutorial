package com.learn.object.access.test;

import com.learn.object.access.AccessBase;

/**
 * ��ͬ��������,����private��default��Ա��,����
 * @author reyshaw
 *
 */

public class AccessChild extends AccessBase {
	
	public void getAccessBaseAttr() {
		
		/*** ���Եķ��� ***/
		System.out.println(super.pubAttr);
		System.out.println(super.proAttr); // ����̳�,�ڲ����Է��ʵ�protected����(���ⲿ�ǲ��ܷ��ʵ�)
//		System.out.println(super.defAttr); // ��ͬ��,default��������
//		System.out.println(super.priAttr); // ��ͬ��,private����,������
		
		/*** �����ķ��� ***/
		super.pubFunc();
		super.proFunc();
//		super.defFunc(); // ��ͬ��,default����������
//		super.priFunc(); // private����,������
	}
}
