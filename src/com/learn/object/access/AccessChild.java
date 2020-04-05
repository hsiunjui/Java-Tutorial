package com.learn.object.access;
/**
 * 同包下子类,除了private外,均可
 * @author reyshaw
 *
 */

public class AccessChild extends AccessBase {
	
	public void getAccessBaseAttr() {
		
		/*** 属性的访问 ***/
		System.out.println(super.pubAttr);
		System.out.println(super.proAttr);
		System.out.println(super.defAttr);
//		System.out.println(super.priAttr); // private属性,不允许
		
		/*** 方法的访问 ***/
		super.pubFunc();
		super.proFunc();
		super.defFunc();
//		super.priFunc(); // private方法,不允许
	}
}
