package com.learn.object.access;
/**
 * ͬ��������,����private��,����
 * @author reyshaw
 *
 */

public class AccessChild extends AccessBase {
	
	public void getAccessBaseAttr() {
		
		/*** ���Եķ��� ***/
		System.out.println(super.pubAttr);
		System.out.println(super.proAttr);
		System.out.println(super.defAttr);
//		System.out.println(super.priAttr); // private����,������
		
		/*** �����ķ��� ***/
		super.pubFunc();
		super.proFunc();
		super.defFunc();
//		super.priFunc(); // private����,������
	}
}
